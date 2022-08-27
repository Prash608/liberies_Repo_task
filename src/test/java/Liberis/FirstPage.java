package Liberis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstPage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {

	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.liberis.com/");
	driver.manage().window().maximize();
	}
	
	
	//  Open ‘Get a Demo’ page & click
	@Test 
	public void m1() {
		
		WebElement Getdemo=driver.findElement(By.xpath("//a[@class='btn']"));
		Getdemo.click();
		 	
	}
	
	@AfterMethod
	public void setdown() {
		
		driver.quit();
		
	}
	
	
}
