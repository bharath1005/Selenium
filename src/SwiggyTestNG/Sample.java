package SwiggyTestNG;

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

public class Sample {
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
    
    driver=new ChromeDriver();
    driver.get("https://www.swiggy.com/");
    
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
    Assert.assertEquals("https://www.swiggy.com/",driver.getCurrentUrl());
    Assert.assertTrue(driver.getTitle().contains("Order"));
    
    WebElement locationtxt = driver.findElement(By.id("location"));
    locationtxt.sendKeys("Salem");
    locationtxt.click();
    
    
 }
	@AfterClass
	public void afterclass() {
    driver.quit();
	}
	
}