package org.git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github {
	public void launch() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
    
    WebDriver driver =new ChromeDriver();
    
    driver.get("https://www.facebook.com/");
    
		
	}
	public static void main(String[] args) {
		Github g=new Github();
		g.launch();
	}

}
