package BasicSeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class javaScriptExecuterTesting {
	
	WebDriver driver;
	
	public void test() {
		
		
		// diferent ways to scroll up and down, and click
		 
        WebElement element = driver.findElement(By.id("id_of_element"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        
        
        // scroll by: can be measured by range: ex. 250, 350
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        
        // if Actions does not work, use java script executor
    
        WebElement element1 = driver.findElement(By.id("my-id"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        
        actions.click();
        
        element1.click();
    
        
        
        WebElement m = driver.findElement(By.linkText("Company"));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        
        js1.executeScript("arguments[0].click();", m);
    
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
