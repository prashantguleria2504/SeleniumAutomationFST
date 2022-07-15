package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage_PageFactory {
	
	
// constructor in Page class, accessing the driver from base class.
	
	WebDriver driver;
	
	public LoginPage_PageFactory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
// Define Identification locators
	
	
	@FindBy(name = "Email")
	WebElement txt_email;
	
	@FindBy(css = "input#Password")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement loginButton;
	
	
	@FindBy(how = How.CSS)
	WebElement txt_password2;
	
	
// Define Methods	
	
	public void enterUserName(String email) {
		
		txt_email.clear();
		txt_email.sendKeys(email);
	}
	
	public void enterPassword(String pwd) {
		
		txt_password.clear();
		txt_password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		
		loginButton.click();
	}
	
	public void verifyAppTitle(String expectedTitle) {
		
		Assert.assertTrue(driver.getTitle().contains(expectedTitle));
	}
	
	public void verifyAppTitle(String actualTitle,String expectedTitle) {
		
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	
	
	
	

}
