package BasicSeleniumTesting;

import org.junit.Before;
import org.junit.Test;

import Utilities.BaseClass;

public class openBrouserUsingDriverClass {
	
	@Before
	public void beforeMethod() {
		// calling the method getDriver() from the package Utilities and the class BaseClass
		BaseClass.getDriver();
		
	}
	@Test
	public void test1() {
		
		String title = BaseClass.getDriver().getTitle();
		System.out.println(title);
		
	}

}
