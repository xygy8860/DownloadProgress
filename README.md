仿360手机助手下载进度条
==

先前在使用360手机助手下载App的时候，对于它的下载动画一直比较喜欢，后来研究了两天，自己动手模仿实现了下载的动画效果。已经在项目中使用，效果还是很不错的。
现在独立成库，开源给喜欢的小伙伴们。废话不说，请看图：

![](https://raw.githubusercontent.com/xygy8860/DownloadProgress/master/_360.gif)


使用
----

Step 1. Add the JitPack repository to your build file 

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        compile 'com.github.xygy8860:DownloadProgress:1.0'
	}
