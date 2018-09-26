package Redbus;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bus {
WebDriver driver;

@BeforeClass
public void beforeclass() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.redbus.in/");
driver.manage().window().maximize();
Thread.sleep(1000);
}

@BeforeMethod
public void beforemethod() {
Date e=new Date();
System.out.println(e);

}

@AfterMethod
public void aftermethod() {
	Date f=new Date();
	System.out.println(f);
	
}

@Test
public void test1() throws InterruptedException {
Assert.assertEquals("https://www.redbus.in/",driver.getCurrentUrl());
Assert.assertTrue(driver.getTitle().contains("Book"));

WebElement iconbtn = driver.findElement(By.id("sign-in-icon-down"));
Actions acc=new Actions(driver);
acc.moveToElement(iconbtn);
iconbtn.click();

WebElement signinlink = driver.findElement(By.id("signInLink"));
signinlink.click();
Thread.sleep(1000);

WebElement emailsign = driver.findElement(By.xpath("//div[@class='signin-screen']"));
emailsign.click();
Thread.sleep(500);

WebElement usertxt = driver.findElement(By.id("email-mobile"));
usertxt.sendKeys("bharatharuncse");

WebElement passtxt = driver.findElement(By.id("password"));
passtxt.sendKeys("100593181194");

WebElement signin = driver.findElement(By.id("doSignin"));
signin.click();

}

@AfterClass
public void afterclass() {
	driver.quit();

}
}
