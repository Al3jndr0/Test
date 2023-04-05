package Practice1Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {

	public static void main(String[] args) throws Exception {
		
		String url;
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();  // it will make your browser full screen
		
		url = "https://www.youtube.com/";
		
		
		driver.get(url);
		
		 System.out.println(driver.getTitle());
		 
		 String title = driver.getTitle();
		 String expectedTitle = "YouTube";
		 
		 if (title.equals(expectedTitle) && driver.getCurrentUrl().equals(url)) {
			 System.out.println("we are in: " + url);
		 }else {
	            System.out.println("You are in different page: " + driver.getCurrentUrl());
	     }
		 
		 
		// searchBox --> class="ytd-searchbox-spt"
		 WebElement searchBox = driver.findElement(By.name("search_query"));
		 
		 Thread.sleep(3000);
		 
		 searchBox.clear();
		 
		 searchBox.sendKeys("cars");
		 
		
		 
		// searchButton --> class="style-scope ytd-searchbox"
		 
		 WebElement searchButton = driver.findElement(By.className("style-scope ytd-searchbox"));
		 
		 searchButton.click();
		 
		 Thread.sleep(3000); // never use in real life
			
			driver.quit();

	}

}
