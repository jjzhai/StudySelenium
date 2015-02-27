package com.jjzhai.common;

import com.thoughtworks.selenium.DefaultSelenium;

public class StopSeleniumServer {
	public void stop(DefaultSelenium selenium) {
		selenium.shutDownSeleniumServer();//关闭selenium服务器
		try {
			Runtime.getRuntime().exec("cmd /k taskkill /f /im cmd.exe");//直接结束进程，有点狠啊
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
