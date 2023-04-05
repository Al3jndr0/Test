package BasicSeleniumTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframePractice1 {
	
	WebDriver driver;
	Actions action;

	@Before
    public void openBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        action = new Actions(driver);
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    
    
    @Test
    public void dragAndDropTest1() {
    	
        clickTab("");
        
        driver.switchTo().frame(0);
        
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Callate la boca Puta");;

        String stringtext = driver.findElement(By.id("tinymce")).getText();
        System.out.println(stringtext);
        
        driver.switchTo().defaultContent();
//        driver.switchTo().parentFrame();
        
    }
    
  public void clickTab(String tabName) {
        
        List<WebElement> tabs = driver.findElements(By.xpath("//div[@id='sidebar']/aside[1]/ul/li"));

        for (WebElement eachTab : tabs) {
            String eachTabText = eachTab.getText();
            System.out.println(eachTabText);

            if (eachTab.getText().contains(tabName)) {
                eachTab.click();
                break;
            }

        }
	}


}
