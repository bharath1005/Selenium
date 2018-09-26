package TestNGtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	WebDriver driver;
	
	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	
	@BeforeMethod
	public void beforeMethod() {
    Date d = new Date();
    System.out.println(d);

}
	
	@AfterMethod
	public void afterMethod() {
    Date d=new Date();
    System.out.println(d);
	}
	
	@Test
	public void test1() {
		AssertJUnit.assertEquals("https://www.facebook.com/",driver.getCurrentUrl());
		AssertJUnit.assertTrue(driver.getTitle().contains("Facebook"));
		
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("Bharath");
        
		WebElement passtxt = driver.findElement(By.id("pass"));
		passtxt.sendKeys("hello");
	}
	
	
	@AfterClass
	public void afterClass() {
    
		driver.quit();
	}	
	
}
