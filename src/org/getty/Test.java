package org.getty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		String title = driver.getTitle();
		System.out.println("Title");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url");
		
		
		WebElement editbtn = driver.findElement(By.xpath("(//a[@data-nav='nav_Editorial_EditorialPhotos'])[1]"));
		Actions acc=new Actions(driver);
		acc.moveToElement(editbtn).perform();
		editbtn.click();
		
		WebElement entbtn = driver.findElement(By.xpath("(//a[text()='Entertainment'])[1]"));
		Actions acc1=new Actions(driver);
		acc1.moveToElement(entbtn);
		entbtn.click();

	}
	public static void main(String[] args) throws InterruptedException {
		Test t=new Test();
		t.launch();
	}
	
}
