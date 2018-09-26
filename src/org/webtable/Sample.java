package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class Sample {
	public void launch() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.manage().window().maximize();
		 List<WebElement> tRows=driver.findElements(By.tagName("tr"));
		 for (int i = 0; i < tRows.size() ; i++) {
			 
			 List<WebElement> tData = driver.findElements(By.tagName("td"));
			 
			 for (int j = 0; j < tData.size(); j++) {
				 String name = tData.get(j).getText();
				 System.out.println(name);
				
			}
			
		}		
        
		
		 					
		
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.launch();
		
	}

}
