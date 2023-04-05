package Practice2Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateOrangeHRM {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		String url;
		
		url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		driver.get(url);
		
		
		WebElement userNameBox = driver.findElement(By.name("username"));
		
		String userName = "Admin";
		String password = "admin123";
		userNameBox.clear();
		userNameBox.sendKeys(userName);
		
		////*[@name='password']
		WebElement passwordBox = driver.findElement(By.xpath("//*[@name='password']"));
		
		passwordBox.clear();
		passwordBox.sendKeys(password);
		
		WebElement loginButtom = driver.findElement(By.xpath("//*[contains(@class,'login-button')]"));
		
		loginButtom.click();
		
		driver.quit();

	}

}
