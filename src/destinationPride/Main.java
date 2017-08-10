package destinationPride;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Main {
	WebDriver driver; 
	     
  @Test (priority= 0, description= "Correct URl")
  public void URL() {
	  
	  driver.get("https://qa.destinationpride.org/app_qa.php/");

	   driver.manage().window().maximize();
	   // to maximize window
	   
	   assertEquals(driver.getTitle(), "Destination Pride - Data-driven LGBTQ+ scores for every city, every country on earth.");
	   
	  /* if (driver.getTitle().contains("Destination Pride - Data-driven LGBTQ+ scores for every city, every country on earth.")){
				  System.out.println("pass");
			  }
			  else {
				  System.out.println("wrong Url" + driver.getTitle());		
			  }*/
  }
  
  @Test 
  public void links() {
	  
	    }
  
  
  @BeforeMethod
  public void beforeMethod() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\peter.panchine\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver(); 
	 
	   // to be able to use Chrome browser

	      
	
	

				  
		   
		 
	 
	  
	  
	  

  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();

  }

}
