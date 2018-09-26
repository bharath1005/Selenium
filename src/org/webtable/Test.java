package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class Test {
	public void launch() {
    
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://toolsqa.com/automation-practice-table/");
	
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	List<WebElement> tRows = driver.findElements(By.tagName("tr"));
	for (WebElement v:tRows) {
		List<WebElement> tData = driver.findElements(By.tagName("td"));
		for(WebElement X:tData){
			String name = X.getText();
			System.out.println(name);
	}
	

	}
	
}
	public static void main(String[] args) {
		Test t=new Test();
		t.launch();
	}
}
