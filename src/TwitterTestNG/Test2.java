package TwitterTestNG;

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

public class Test2 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass() throws InterruptedException {
    String setProperty = System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
    
    driver=new ChromeDriver();
    driver.get("https://twitter.com/login");
    driver.manage().window().maximize();
    Thread.sleep(500);
    
    
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
	public void test1() throws InterruptedException {
    Assert.assertEquals("https://twitter.com/login",driver.getCurrentUrl());
    Assert.assertTrue(driver.getTitle().contains("Login"));
    Thread.sleep(1000);
	
    WebElement usertxt = driver.findElement(By.xpath("//input[@placeholder='Phone, email or username']"));
    usertxt.sendKeys("bharatharuncse@gmail.com");
    Thread.sleep(1000);
    
    WebElement passtxt = driver.findElement(By.className("js-password-field"));
    passtxt.sendKeys("123456");
    Thread.sleep(1000);
    
     WebElement lgnbtn = driver.findElement(By.xpath("//button[@type='submit']"));
     lgnbtn.click();
     Thread.sleep(1000);
	
	
	}
	
	@AfterClass
	public void afterclass() {
    driver.quit();
	}
	
	
}
