package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	//trigger testNg xml file from Maven
	//how to execute all test cases from Test folder - mvn test
	@Test
	public void BrowserAutomation() {
		System.out.println("BrowserAutomation");
	}
	
	@Test
	public void elementsUi() {
		System.out.println("elementsUi");
	}

}
