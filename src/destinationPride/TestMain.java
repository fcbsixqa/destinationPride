package destinationPride;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peter.panchine\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   // to be able to use Chrome browser

		   WebDriver driver = new ChromeDriver();         
	
				 
		   driver.get("https://qa.destinationpride.org/app_qa.php/");

		   driver.manage().window().maximize();
		   // to maximize window
		   
		   if (driver.getTitle().contains("Destination Pride - Data-driven LGBTQ+ scores for every city, every country on earth.")){
					  System.out.println("pass");
				  }
				  else {
					  System.out.println("wrong Url" + driver.getTitle());			  
				  }
		   
		   driver.quit();

	 
		  
	  }

	}


