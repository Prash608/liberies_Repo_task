package Liberis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class page {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {

	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.liberis.com/become-a-partner");
	driver.manage().window().maximize();
	
	}
	
	
	
	//Verify the validation message when user does not make a partner selection and click ‘Get a demo’:

	@Test
	public void m1() {
		
		
          WebElement getdemo = driver.findElement(By.xpath("(//a[text()='Get a demo'])[5]"));
	     	 
          getdemo.click();
		 
		  WebElement Error = driver.findElement(By.xpath("//div[text()='Please select a type of partner']"));
		  
		  String actualmessage=Error.getText();
		  String expectedMessage="Please select a type of partner";
		  
		  Assert.assertEquals(actualmessage, expectedMessage);
		  
		  System.out.println("Error message is :- "+ Error.getText());
		 		
	}
	
	
	@AfterMethod
	public void setdown() {
		
		driver.quit();
		
		
	}
	
	

}
