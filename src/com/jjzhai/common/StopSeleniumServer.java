package com.jjzhai.common;

import com.thoughtworks.selenium.DefaultSelenium;

public class StopSeleniumServer {
	public void stop(DefaultSelenium selenium) {
		selenium.shutDownSeleniumServer();//¹Ø±Õselenium·þÎñÆ÷
	}
}
