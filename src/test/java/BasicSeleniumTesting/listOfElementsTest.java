package BasicSeleniumTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listOfElementsTest {
	
	WebDriver driver;

	@Before
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
	}
	               // Amazon.com
	@Ignore
	@Test
	public void getListOfTabs() {
		
		List<WebElement> tabs = driver.findElements(By.xpath("//div[@id= 'nav-xshop']/a"));
		
		for (WebElement eachTab : tabs) {
//			String eachTabText = eachTab.getText();
//			System.out.println(eachTabText);
			
			   if(eachTab.getText().contains("Prime")) {
	                eachTab.click();
	                break;
	            }
			   
		}   
	            
			
		}
		
		////div[@id= 'sidebar']/aside
		@Test
		public void clickTab() {
			
			List<WebElement> tabs = driver.findElements(By.xpath("//div[@id= 'sidebar']/aside[1]/ul/li[2]"));
			
			for (WebElement eachTab : tabs) {
				String eachTabText = eachTab.getText();
				System.out.println(eachTabText);
				
				   if(eachTab.getText().contains("Droppable")) {
		                eachTab.click();
		                break;
		            }
		
		
		
			}	
		
	}

}
