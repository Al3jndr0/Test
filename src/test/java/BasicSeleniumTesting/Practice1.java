package BasicSeleniumTesting;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice1 {
	
	WebDriver driver;
	
    @Before
	public void openBrowser() {

	       WebElement checkBox1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
	        
	       WebElement checkBox2 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
	       
	        Boolean isTrueOrFALSE = checkBox1.isSelected();
	        
	        if(isTrueOrFALSE) {
	            System.out.println("It is selected");
	        }else {
	        	checkBox2.click();
	            
	        } 
	}       
}
