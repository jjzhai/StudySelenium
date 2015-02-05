package com.jjzhai.common;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.thoughtworks.selenium.DefaultSelenium;

public class StartSelenium {
	public DefaultSelenium start() {
		String filePathString="files/SeleniumConnectArguments.properties";
		
		String serverHost="";
		int serverPort;
		String browserString="";
		String browserURL="";
		
		Properties properties = new Properties();
		
		try {
			InputStream inputStream = new FileInputStream(filePathString);					
			properties.load(inputStream);								
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		serverHost = properties.getProperty("serverHost", "localhost");
		serverPort = Integer.parseInt(properties.getProperty("serverPort","4445"));
		browserString = properties.getProperty("browserString","*iexplore");
		browserURL = properties.getProperty("browserURL","http://www.baidu.com");
		
		DefaultSelenium selenium=new DefaultSelenium(serverHost, serverPort, browserString, browserURL);
		selenium.start();
		return selenium;
	}
	
	public DefaultSelenium startAssignBrowser(String browserType) {
		String filePathString="files/SeleniumConnectArguments.properties";
		
		String serverHost="";
		int serverPort;
		String browserString="";
		String browserURL="";
		
		Properties properties = new Properties();
		
		try {
			InputStream inputStream = new FileInputStream(filePathString);					
			properties.load(inputStream);								
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		serverHost = properties.getProperty("serverHost", "localhost");
		serverPort = Integer.parseInt(properties.getProperty("serverPort","4445"));
		if(browserType.equalsIgnoreCase("IE")){
			browserString = properties.getProperty("browserIEString");			
		}
		else if(browserType.equalsIgnoreCase("Firefox")){
			browserString = properties.getProperty("browserFirefoxString");
		}		
		else if(browserType.equalsIgnoreCase("Safari")){
			browserString = properties.getProperty("browserSafariString");
		}
		else if(browserType.equalsIgnoreCase("Opera")){
			browserString = properties.getProperty("browserOperaString");
		}
		else{
			browserString = properties.getProperty("browserChromeString");
		}		
		browserURL = properties.getProperty("browserURL","http://www.baidu.com");
		
		DefaultSelenium selenium=new DefaultSelenium(serverHost, serverPort, browserString, browserURL);
		selenium.start();
		return selenium;
	}
}
