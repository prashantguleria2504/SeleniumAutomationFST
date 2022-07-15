package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	
	
// constructor in Page class, accessing the driver from base class.
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
// Define Identification locators
	
	By txt_email = By.name("Email");
	By txt_password = By.cssSelector("input#Password");
	By loginButton = By.xpath("//button[text()='Log in']");
	
	
// Define Methods	
	
	public void enterUserName(String email) {
		
		driver.findElement(txt_email).clear();
		driver.findElement(txt_email).sendKeys(email);
	}
	
	public void enterPassword(String pwd) {
		
		driver.findElement(txt_password).clear();
		driver.findElement(txt_password).sendKeys(pwd);
	}
	
	public void clickLogin() {
		
		driver.findElement(loginButton).click();
	}
	
	public void verifyAppTitle(String expectedTitle) {
		
		Assert.assertTrue(driver.getTitle().contains(expectedTitle));
	}
	
	public void verifyAppTitle(String actualTitle,String expectedTitle) {
		
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	
	
	
	

}
