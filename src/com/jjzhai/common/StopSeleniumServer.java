package com.jjzhai.common;

import com.thoughtworks.selenium.DefaultSelenium;

public class StopSeleniumServer {
	public void stop(DefaultSelenium selenium) {
		selenium.shutDownSeleniumServer();//�ر�selenium������
		try {
			Runtime.getRuntime().exec("cmd /k taskkill /f /im cmd.exe");//ֱ�ӽ������̣��е�ݰ�
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
