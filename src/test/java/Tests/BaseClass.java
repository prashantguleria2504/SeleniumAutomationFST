package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.LoginPage_PageFactory;

public class BaseClass {
	
	 WebDriver driver;
	 LoginPage lp;
	 LoginPage_PageFactory lpf;


	    @BeforeTest
	    public void launchApp() throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();

	        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

	        Thread.sleep(3000);
	        
	  // Objects of Page classes
	   	 lp = new LoginPage(driver);
	   	 lpf = new LoginPage_PageFactory(driver);

	    }

	    @AfterTest
	    public void teatdown() {

	        driver.close();
	        
	      
	    }
	    
 
	    
	   

}
