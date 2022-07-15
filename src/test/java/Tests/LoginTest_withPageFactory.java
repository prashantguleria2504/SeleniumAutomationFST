package Tests;

import org.testng.annotations.Test;

public class LoginTest_withPageFactory extends BaseClass{

	
	@Test
	public void loginTest() {
		
		lpf.enterUserName("admin@yourstore.com");
		lpf.enterPassword("admin");
		lpf.clickLogin();
		
		lpf.verifyAppTitle(driver.getTitle());
		System.out.println(driver.getTitle());
		
		lpf.verifyAppTitle(driver.getTitle(), "Dashboard / nopCommerce administration");
		System.out.println("Actual & Expected matches" + driver.getTitle());
		
	}
	
}
