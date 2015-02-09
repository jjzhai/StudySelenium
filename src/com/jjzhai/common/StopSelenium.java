package com.jjzhai.common;

import com.thoughtworks.selenium.DefaultSelenium;

public class StopSelenium {
	public void stop(DefaultSelenium selenium) {
		selenium.close();//关闭浏览器
		selenium.stop();//终止当前对selenium服务器的会话，并关闭selenium控制界面
	}
}
