package org.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	public void launchBrowser() throws InterruptedException {
    
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	
	WebElement courseclick = driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions acc=new Actions(driver);
	acc.moveToElement(courseclick).perform();
	acc.click();
	Thread.sleep(1000);
	
	WebElement sftbtn = driver.findElement(By.xpath("//span[text()='Software Testing Training ']"));
	Actions acc1=new Actions(driver);
	acc1.moveToElement(sftbtn).perform();
	acc1.click();
	Thread.sleep(1000);

	
	WebElement seleniumbtn = driver.findElement(By.xpath("//span[text()='Selenium Training']"));
	Actions acc2=new Actions(driver);
	acc2.moveToElement(seleniumbtn).perform();
	
	driver.quit();
	
		}
	public static void main(String[] args) throws InterruptedException {
		Sample s=new Sample();
		s.launchBrowser();
	}

}
