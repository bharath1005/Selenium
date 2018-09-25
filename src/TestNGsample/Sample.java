package TestNGsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
	WebDriver driver;
	
	@BeforeClass
	public void bro() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\Selenium\\drivers\\chromedriver.exe");
driver= new ChromeDriver();
driver.get("https://www.facebook.com/");

	}
	@Parameters({"user","pass"})
	@Test
	public void login(String userN,@Optional("hello") String passD) {
		driver.findElement(By.id("email")).sendKeys("userN");
		driver.findElement(By.id("pass")).sendKeys("passD");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
