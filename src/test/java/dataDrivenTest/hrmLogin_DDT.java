package dataDrivenTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class hrmLogin_DDT extends BaseClassHRM{
	
	@Test (dataProvider = "SmokeTest")
	public void verifyLoginwithInvalidData(String userid, String pwd) {
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(userid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		
		driver.findElement(By.id("btnLogin")).click();
		
		// validate error message
		
		Boolean errorMsg = driver.findElement(By.id("spanMessage")).isDisplayed();
		Assert.assertTrue(errorMsg);
		
	}
	
	@DataProvider (name = "SmokeTest")
	public Object[][] SmokeTestData() {
		
		Object[][] data = {{"user1","password1"},{"user2","password2"},{"user3","password3"}};
		return data;
	}
	
	@DataProvider (name = "RegressionTest")
	public Object[][] RegressionTestData() {
		
		Object[][] data = {{"Regressionuser1","password1"},{"Regressionuser2","password2"},{"Regressionuser3","password3"}};
		return data;
	}
	
	

}