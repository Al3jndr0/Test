package FiftyOneTestCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.BaseClass;

public class myAccount_RegistrationTestCases {
	
	@Before
	public void beforeMethod() {
	
		BaseClass.getDriver();
		
	}
	@Test
	public void register() {
		
	////ul[@id='main-nav']/li[2]/a
		
		
		
		WebElement myAccount = BaseClass.getDriver().findElement(By.xpath("//ul[@id='main-nav']/li[2]/a"));
		myAccount.click();
		
		WebElement userName = BaseClass.getDriver().findElement(By.xpath("//input[@id='username']"));
		userName.clear();
		userName.sendKeys("albert1234@gmail.com");
		
		WebElement regPasswod = BaseClass.getDriver().findElement(By.xpath("//input[@id='reg_password']"));
		regPasswod.clear();
		regPasswod.sendKeys("ArnoldShwartz");
		
		
	
	}

}
