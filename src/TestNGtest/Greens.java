package TestNGtest;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class Greens {
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass() {
	System.setProperty("webdriver.ie.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\IEDriverServer.exe");
	
	driver=new InternetExplorerDriver();
	driver.get("https://www.snapdeal.com/login");
	
    
}
	
	@BeforeMethod
	public void beforemethod() {
	Date d=new Date();
	System.out.println(d);
	

	}
	
	@AfterMethod
	public void aftermethod() {
	Date e=new Date();
	System.out.println(e);

	}
	
	@Test
	public void test1() {
    Assert.assertEquals("https://www.snapdeal.com/login",driver.getCurrentUrl());
    Assert.assertTrue(driver.getTitle().contains("https://www.snapdeal.com/login"));
    
    WebElement mobtxt = driver.findElement(By.id("userName"));
    mobtxt.sendKeys("8300840420");
    
    WebElement cntbtn = driver.findElement(By.id("checkUser"));
    cntbtn.click();
	
}
	@AfterClass
	public void afterclass() {
    driver.quit();
	}
	
	
	
	

}
