package dataDrivenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.LoginPage_PageFactory;

public class BaseClassHRM {
	
	 WebDriver driver;


	    @BeforeTest
	    public void launchApp() throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();

	        driver.get("https://opensource-demo.orangehrmlive.com/");

	        Thread.sleep(3000);
	        
	  // Objects of Page classes


	    }

	    @AfterTest
	    public void teatdown() {

	        driver.close();
	        
	      
	    }
	    
 
	    
	   

}
