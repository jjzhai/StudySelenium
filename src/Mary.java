import com.jjzhai.common.StartSelenium;
import com.jjzhai.common.StartSeleniumServer;
import com.jjzhai.common.StopSelenium;
import com.jjzhai.common.StopSeleniumServer;
import com.jjzhai.test.TestSelect;
import com.jjzhai.testcase.*;
import com.thoughtworks.selenium.DefaultSelenium;

public class Mary {

	public static void main(String[] args) {
		//[start]start selenium server
		StartSeleniumServer startSeleniumServer = new StartSeleniumServer();
		startSeleniumServer.start();
		//[end]
		
		//[start]start selenium by firefox
		StartSelenium startSelenium = new StartSelenium();
		//DefaultSelenium selenium = startSelenium.start();	
		DefaultSelenium selenium = startSelenium.startAssignBrowser("firefox");
		//[end]
		
		//[start]run testcase
		TestCase001 testcase001 = new TestCase001();
		testcase001.testCase(selenium);
		
		TestSelect testSelect = new TestSelect();
		testSelect.test(selenium);
		//[end]
		
		//[start]stop selenium
		StopSelenium stopSelenium = new StopSelenium();
		stopSelenium.stop(selenium);
		//[end]
		
		//[start]stop selenium server
		StopSeleniumServer stopSeleniumServer = new StopSeleniumServer();
		stopSeleniumServer.stop(selenium);
		//[end]
	}
}
