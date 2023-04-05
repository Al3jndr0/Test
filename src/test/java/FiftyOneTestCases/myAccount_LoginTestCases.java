package FiftyOneTestCases;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utilities.BaseClass;

public class myAccount_LoginTestCases {

	@Before
	public void beforeMethod() {

		BaseClass.getDriver();

	}

	@Test
	public void login() throws InterruptedException {

		WebElement myAccount = BaseClass.getDriver().findElement(By.linkText("My Account"));
		myAccount.click();

		Thread.sleep(3000);

		WebElement loginUserName = BaseClass.getDriver().findElement(By.xpath("//input[@id='username']"));
		loginUserName.clear();
		loginUserName.sendKeys("albert1234@gmail.com");

		WebElement loginPasswod = BaseClass.getDriver().findElement(By.xpath("//input[@id='password']"));
		loginPasswod.clear();
		loginPasswod.sendKeys("Albert,123.809");

	}

}
