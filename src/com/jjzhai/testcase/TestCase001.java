package com.jjzhai.testcase;

import com.thoughtworks.selenium.DefaultSelenium;

public class TestCase001 {

	/**
	 * @param args
	 */
	public void testCase(DefaultSelenium selenium) {		
		selenium.open("http://www.baidu.com");
		selenium.open("http://www.hao123.com");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		selenium.goBack();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		selenium.type("id=kw", "∫Œ“‘ÛœÛÔƒ¨");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		selenium.refresh();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		selenium.windowMaximize();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}