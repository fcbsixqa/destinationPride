package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {


	
    private static WebElement element = null;
    
    //Links *****************************************************
    
    public static WebElement topLogo(WebDriver driver) {
    	
    	element = driver.findElement(By.className("toolbar-title"));
    	
    	return element;
    }
	
public static WebElement linkFaq(WebDriver driver) {
    	
    	element = driver.findElement(By.linkText("FAQ"));
    	
    	return element;
    }
    
  
    
    
    
    // Search bar ***********************************************
    
public static WebElement searchMain(WebDriver driver) {
    	
    	element = driver.findElement(By.id("geoInput"));
    	
    	return element;
    }
    
    
}
