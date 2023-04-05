package BasicSeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionClassTasks {
	
	WebDriver driver;
	Actions actions;

	@Before
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		actions = new Actions(driver);
		driver.get("https://Amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	   // to hover over a link or buttom
	@Test
	public void test1() {
		
		actions.moveToElement(driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]"))).build().perform();
		
	}

}
