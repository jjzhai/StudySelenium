package com.jjzhai.test;

import com.thoughtworks.selenium.DefaultSelenium;

public class TestSelect {
	public void test(DefaultSelenium selenium){
		selenium.open("http://www.baidu.com");
		selenium.windowMaximize();
		if(selenium.isTextPresent("登录")){
			selenium.click("name=tj_login");
			
//			selenium.type("name=userName", "15001132827");
//			selenium.type("name=password", "jingpi");
//			if(selenium.isChecked("name=memberPass")){
//				selenium.uncheck("name=memberPass");
//			}
//			else {
//				selenium.check("name=memberPass");
//			}
//			selenium.click("id=TANGRAM__PSP_8__submit");
//			selenium.waitForPageToLoad("3000");			
//		}
//		selenium.click("link=更多>>");
//		selenium.waitForPageToLoad("3000");
//		selenium.click("link=贴吧");
//		selenium.waitForPageToLoad("3000");
//		selenium.click("class=senior-search-link");
//		selenium.waitForPageToLoad("3000");
//		selenium.select("name=sm", "label=按相关性排序");
//		selenium.select("name=sm", "value=2");
//		selenium.select("name=sm", "index=2");		
		}
	}
}
