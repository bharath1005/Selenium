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

public class Test1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void launch() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
    
     driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

 }
	@BeforeMethod
	public void beforeMethod() {
    Date d=new Date();
    System.out.println(d);
	}
	
	@AfterMethod
	public void afterMethod() {
    Date d=new Date();
    System.out.println(d);
	}
	
	@Test
	public void test1() throws InterruptedException {
	AssertJUnit.assertEquals("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin",driver.getCurrentUrl());
	AssertJUnit.assertTrue(driver.getTitle().contains("Gmail"));
    
	WebElement gmailtxt = driver.findElement(By.id("identifierId"));
	gmailtxt.sendKeys("bharatharuncse");
	
	WebElement nxtbtn = driver.findElement(By.xpath("//span[text()='Next']"));
	nxtbtn.click();
	Thread.sleep(1000);
	
	WebElement passtxt = driver.findElement(By.xpath("//input[@type='password']"));
	passtxt.sendKeys("100593181194");
    
	WebElement nxt1btn = driver.findElement(By.xpath("//span[text()='Next']"));
	nxt1btn.click();
	
}
	
	@AfterClass
	public void afterclass() {
    driver.quit();
	}
	
	}
