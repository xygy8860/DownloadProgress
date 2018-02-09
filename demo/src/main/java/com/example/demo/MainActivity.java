package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.chenghui.downloadprogress.widget.DownloadView;

public class MainActivity extends Activity {

    private DownloadView mProgressBar;
    private TimeRunnable mRunnble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgressBar = (DownloadView) findViewById(R.id.progressbar);

        mRunnble = new TimeRunnable();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProgressBar.start(new DownloadView.OnCompleteListener() {
                    @Override
                    public void startComplete() {
                        mProgressBar.postDelayed(mRunnble, 100);
                    }
                });
            }
        });

    }

    class TimeRunnable implements Runnable {
        int progress = 0;

        @Override
        public void run() {
            if (progress <= 100) {
                try {
                    mProgressBar.setProgress(progress);
                    progress++;
                    mProgressBar.postDelayed(mRunnble, 100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
