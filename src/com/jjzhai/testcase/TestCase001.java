package com.jjzhai.testcase;

import com.jjzhai.common.StartSelenium;
import com.thoughtworks.selenium.DefaultSelenium;

public class TestCase001 {

	/**
	 * @param args
	 */
	public void testCase() {
		// TODO Auto-generated method stub	
		DefaultSelenium selenium = null;
		StartSelenium startSelenium = new StartSelenium();
		//startSelenium.start(selenium);	
		selenium = startSelenium.startAssignBrowser("firefox");
		//selenium.windowFocus();
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
		selenium.type("id=kw", "��������Ĭ");
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
		selenium.close();
	}
}