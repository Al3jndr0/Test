package tuesdaySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium1 {
	
	public static void main(String[] args) {
		 String url;

	        WebDriver driver;

	        WebDriverManager.chromedriver().setup();

	        driver = new ChromeDriver();

	        // it will make your browser full screen
	        driver.manage().window().maximize();

	        /*
	         * open google.com
	         */
	        url = "https://www.google.com/";

	        // this will nagivate you to the url you have passed
	        driver.get(url);

	        // driver.getTitle() --> this will return you the title of the page

	        System.out.println(driver.getTitle());
	        String title = driver.getTitle();
	        String expectedTitle = "Google";

	       

	        if (title.equals(expectedTitle) && driver.getCurrentUrl().equals(url)) {
	            System.out.println("We are in " + url);
	        } else {
	            System.out.println("You are in different page: " + driver.getCurrentUrl());
	        }
	        
	        
	        url = "https://www.amazon.com/";
	        // this will navigate you to the url you have pass, it is different than the driver.get
	       
	        driver.navigate().to(url);
			
	        if (driver.getCurrentUrl().equals("https://www.amazon.com/")) {
	            System.out.println("We are in " + url);
	        } else {
	            System.out.println("You are in different page: " + driver.getCurrentUrl());
	        }
	        
	        
	     // this will navigate you back to previous page which is google.com
	        driver.navigate().back();
	        
	        if (driver.getCurrentUrl().equals("https://www.google.com/")) {
	            System.out.println("We are in " + "https://www.google.com/");
	        } else {
	            System.out.println("You are in different page: " + driver.getCurrentUrl());
	        }
	        
	        // this will navigate you forward page which in this case it is amazon.com
            driver.navigate().forward();
	        
	        if (driver.getCurrentUrl().equals("https://www.amazon.com/")) {
	            System.out.println("We are in " + "https://www.amazon.com/");
	        } else {
	            System.out.println("You are in different page: " + driver.getCurrentUrl());
	        }
	        
	        driver.quit();
	        
	        
	        
	        
		
		
		
		
		
		
		
		
	}
	

}
