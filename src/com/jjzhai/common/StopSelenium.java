package com.jjzhai.common;

import com.thoughtworks.selenium.DefaultSelenium;

public class StopSelenium {
	public void stop(DefaultSelenium selenium) {
		selenium.close();//�ر������
		selenium.stop();//��ֹ��ǰ��selenium�������ĻỰ�����ر�selenium���ƽ���
	}
}
