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
    

public static WebElement linkAboutP(WebDriver driver) {
	
	element = driver.findElement(By.linkText("About PFLAG"));
	
	return element;
}

public static WebElement linkProject(WebDriver driver) {
	
	element = driver.findElement(By.linkText("The Project"));
	
	return element;
}



  
    
    
    
    // Search bar ***********************************************
    
public static WebElement searchMain(WebDriver driver) {
    	
    	element = driver.findElement(By.id("geoInput"));
    	
    	return element;
    }
    
public static WebElement searchArrow(WebDriver driver) {
	
	element = driver.findElement(By.id("search"));
	
	return element;
}

    
}
