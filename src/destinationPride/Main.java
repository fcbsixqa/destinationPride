package destinationPride;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import pageObjects.MainPage;

public class Main {
	
	WebDriver driver; 
	     
	
	// Tests **************************************************************************************
	
	
	
  @Test (priority= 0, description= "Main Page Load")
  public void mainsPageLoad() {
	  
	driver.get("https://qa.destinationpride.org/app_qa.php/");

	assertEquals(driver.getTitle(), "Destination Pride - Data-driven LGBTQ+ scores for every city, every country on earth.");
	   
	  
}
   
  // Main page links tests ****************************************************************************
  
  
  @Test (priority = 5)
  public void projectPageLink() {
	  MainPage.linkProject(driver).click();
	  
	  assertEquals(driver.getTitle(), "The Project | Destination Pride");
	  	  
	  	    }
  
  @Test (priority = 2)
  public void aboutPageLink() {
	  MainPage.linkAboutP(driver).click();
	  
	  assertEquals(driver.getTitle(), "About PFLAG Canada | Destination Pride");
	  	  
	  	    }
  
  @Test (priority = 3)
  public void faqtPageLink() {
	  MainPage.linkFaq(driver).click();
	  
	  assertEquals(driver.getTitle(), "FAQs | Destination Pride");
	  	  
	  	    }
  
  @Test (priority = 4)
  public void mainLogoLink() {
	  MainPage.topLogo(driver).click();
	 
	  assertEquals(driver.getTitle(), "Destination Pride - Data-driven LGBTQ+ scores for every city, every country on earth.");
	  	  
	  	    }
  
  //
  
  
  
  
  // TextBox functionality ********************************************************************* 
  
  
  @Test (priority = 1)
  public void inputField() throws InterruptedException {
	  MainPage.topLogo(driver).click();
	  MainPage.searchMain(driver).sendKeys("Toronto, Ontario");
	  Thread.sleep(1000);
	
	  MainPage.searchArrow(driver).click();
	  Thread.sleep(1000);
	  WebDriverWait wait = new WebDriverWait(driver,20);
	  WebElement detail;
	  detail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cityDetail")));
	  assertEquals(driver.findElement(By.className("detail-title")).getText(), "Toronto, Canada");
	  
	  	    }
  
  
  
  
  
//settings *********************************************************************************************
  
  
  @BeforeClass
  public void beforeMethod() {
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\peter.panchine\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver(); 
	 driver.get("https://qa.destinationpride.org/app_qa.php/");

	   driver.manage().window().maximize();
	  

	      
	
	  
	  
	  

  }

  @AfterClass
  public void afterMethod() {
	  
	 driver.quit();

  }

}
