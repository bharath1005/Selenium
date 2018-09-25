package org.flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart {
	public void launchBrowser() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.flipkart.com");
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println("Title");
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Url");
	
	
	WebElement closebtn = driver.findElement(By.xpath("//button[text()='✕']"));
	closebtn.click();
	Thread.sleep(1000);
	
	WebElement homeclick = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	Actions acc=new Actions(driver);
    acc.moveToElement(homeclick).perform();
    Thread.sleep(500);
    homeclick.click();
    
    WebElement chairclick = driver.findElement(By.xpath("(//a[text()='Chairs'])[1]"));
    Actions acc1=new Actions(driver);
    acc1.moveToElement(chairclick).perform();
    chairclick.click();
    
    WebElement onechair = driver.findElement(By.xpath("//a[@title='Green Soul Vienna High Back Office Chair (Black Tan) Leatherette Office Executive Chair']"));
    Actions acc2=new Actions(driver);
    acc2.moveToElement(onechair).perform();
    onechair.click();
    
    
    }
	public static void main(String[] args) throws InterruptedException {
		Flipcart f=new Flipcart();
		f.launchBrowser();
	}

}
