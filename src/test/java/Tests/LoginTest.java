package Tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass{

	
	@Test
	public void loginTest() {
		
		lp.enterUserName("admin@yourstore.com");
		lp.enterPassword("admin");
		lp.clickLogin();
		
		lp.verifyAppTitle(driver.getTitle());
		System.out.println(driver.getTitle());
		
		lp.verifyAppTitle(driver.getTitle(), "Dashboard / nopCommerce administration");
		System.out.println("Actual & Expected matches" + driver.getTitle());
		
	}
	
}
