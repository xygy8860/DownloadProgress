仿360手机助手下载进度条
==

先前在使用360手机助手下载App的时候，对于它的下载动画一直比较喜欢，后来研究了两天，自己动手模仿实现了下载的动画效果。已经在项目中使用，效果还是很不错的。
现在独立成库，开源给喜欢的小伙伴们。废话不说，请看图：

![](https://raw.githubusercontent.com/xygy8860/DownloadProgress/master/_360.gif)

使用步骤
====

1.gradle
----

Step 1. Add the JitPack repository to your build file 
````
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
````

Step 2. Add the dependency

````
	dependencies {
	        compile 'com.github.xygy8860:DownloadProgress:1.0'
	}
````

2.布局
--

和系统控件一样的使用方法，直接在布局文件中使用即可

```
    <com.chenghui.downloadprogress.widget.DownloadView
        android:id="@+id/progressbar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
```


3.Java文件
--
Activity或者Fragment等Java文件中，findviewById找到控件后，mProgressBar.start即可开始动画下载。

````
    final DownloadView mProgressBar = (DownloadView) findViewById(R.id.progressbar);
    mProgressBar.start(new DownloadView.OnCompleteListener() {
        @Override
        public void startComplete() {
            mProgressBar.postDelayed(mRunnble, 100);
        }
    });
````

根据下载进度，显示百分比数据：

````
    mProgressBar.setProgress(progress);
````

至此，已经完成集成了。