package org.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public void launchBrowser() {
		
		//To launch Browser
    System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
    
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    
    String title = driver.getTitle();
    System.out.println("Title");
    
    String currentUrl = driver.getCurrentUrl();
    System.out.println("Current Url");
    
    WebElement emailtxt = driver.findElement(By.id("email"));
    emailtxt.sendKeys("bharatharuncse");
    Actions acc=new Actions(driver);
    acc.doubleClick(emailtxt).perform();
    
    WebElement passtxt = driver.findElement(By.id("pass"));
    passtxt.sendKeys("123456");
    
    WebElement btnlgn = driver.findElement(By.id("u_0_8"));
    btnlgn.click();
    
    driver.quit();
    
    }
	public static void main(String[] args) {
		Test t=new Test();
		t.launchBrowser();
		
		
	}

}
