package cohort13_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowserTesting {

	public static void main(String[] args) {
		// declared the driver object
		WebDriver driver;
		
		//  setting the chrome driver path
		System.setProperty("webdriver.chrome.driver", "/Users/azarias/Downloads/chromedriver");
		

		
		// initialized webdriver to chromedriver
		 driver = new ChromeDriver();
		
		
		String url = "https://www.techcircleschool.com/";
		
		driver.get(url);

	}

}
