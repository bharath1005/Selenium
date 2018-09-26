package org.cycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues {
	public void launch() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html ");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement firstmouse = driver.findElement(By.xpath("//a[text()='Sports & More']"));
	    Actions acc=new Actions(driver);
	    acc.moveToElement(firstmouse).perform();
	    Thread.sleep(1000);
	    
	    WebElement secondmouse = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
	    acc.moveToElement(secondmouse).perform();
	    secondmouse.click();
	    Thread.sleep(1000);
	    
	    WebElement thirdmouse = driver.findElement(By.xpath("//img[@id='det_img_4338086']"));
	    acc.moveToElement(thirdmouse).perform();
	    thirdmouse.click();
	    Thread.sleep(500);
	    
	    WebElement addbtn = driver.findElement(By.id("add_cart"));
	    acc.moveToElement(addbtn).perform();
	    addbtn.click();
	    
	    
	  }
	public static void main(String[] args) throws InterruptedException {
		Shopclues s=new Shopclues();
		s.launch();
	}

}
