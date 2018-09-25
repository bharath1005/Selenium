package org.shopclues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	public void launch() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		Thread.sleep(1000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(1000);
		
		WebElement firstmouse = driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(firstmouse).perform();
		
		WebElement secoundmouse = driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
	    ac.moveToElement(secoundmouse).perform();
	    Thread.sleep(1000);
		secoundmouse.click();
		
	}
	public static void main(String[] args) throws InterruptedException {
		Sample s=new Sample();
		s.launch();
	}

}
