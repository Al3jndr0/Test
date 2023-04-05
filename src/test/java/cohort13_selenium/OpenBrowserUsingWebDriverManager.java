package cohort13_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserUsingWebDriverManager {

	public static void main(String[] args) {

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		//declared and initialized webdriver to chromedriver
		 driver = new ChromeDriver();
		
		String url = "https://www.techcircleschool.com/";
		
		driver.get(url);


	}

}
