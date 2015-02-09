package com.jjzhai.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.Properties;

public class StartSeleniumServer {
	public void start() {
		String propertiesAddress="files\\SeleniumConnectArguments.properties";
		String startSeleniumServerCommand = "";
		
		//[start]读取属性文件
		Properties properties = new Properties();
		try {
			InputStream inputStream = new FileInputStream(propertiesAddress);					
			properties.load(inputStream);								
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//[end]
		
		//[start]将启动selenium server命令写入bat文件
		startSeleniumServerCommand = properties.getProperty("startSeleniumServerCommand");		
		String[] cmdarray = startSeleniumServerCommand.split(",");
		try {
			File file = new File("files\\startSeleniumServer.bat");
			if(file.exists()){
				file.delete();
			}
			file.createNewFile();
			
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file,true),"UTF-8");
			
			for (int i = 0; i < cmdarray.length; i++) {
				outputStreamWriter.write(cmdarray[i]);
				outputStreamWriter.append("\r\n");
			}
			outputStreamWriter.close();	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//[end]
		
		//[start]执行bat文件，启动selenium server
		try {
			Runtime.getRuntime().exec("cmd /k start files\\startSeleniumServer.bat");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//[end]				
	}	
}
