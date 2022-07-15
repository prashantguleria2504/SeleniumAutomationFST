package headLessModeExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.LoginPage_PageFactory;

public class BaseClassAmazon {
	
	 WebDriver driver;


	    @BeforeTest
	    public void launchApp() throws InterruptedException {
	    	
	    	WebDriverManager.chromedriver().setup();
	    	
	        //headless
	        ChromeOptions co = new ChromeOptions();
	        co.addArguments("--headless", "--window-size=1920,1200");
	    //    co.addArguments("ignore-certificate-errors");
	        
	        

	  //      WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(co);
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();

	        driver.get("https://www.amazon.in/");

	        Thread.sleep(3000);
	        
	  // Objects of Page classes


	    }

	    @AfterTest
	    public void teatdown() {

	        driver.close();
	        
	      
	    }
	    
 
	    
	   

}
