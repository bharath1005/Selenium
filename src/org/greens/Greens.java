package org.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
	private void launch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		driver.manage().window().maximize();
		 
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    
	    WebElement firstmouse = driver.findElement(By.xpath("//a[text()='COURSES']"));
	    Actions ac=new Actions(driver);
	    ac.moveToElement(firstmouse).perform();
	    Thread.sleep(1000);
	    
	    WebElement secoundmouse = driver.findElement(By.xpath("//span[text()='SAP Training ']"));
	    ac.moveToElement(secoundmouse).perform();
	    
	    WebElement thirdmouse = driver.findElement(By.xpath("//span[text()='SAP MM Training']"));
	    ac.moveToElement(thirdmouse).perform();
        thirdmouse.click();	    

	}
	public static void main(String[] args) throws InterruptedException {
		Greens g=new Greens();
		g.launch();
	}

}
