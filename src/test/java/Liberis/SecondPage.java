package Liberis;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondPage {

WebDriver driver;
	
	@BeforeMethod
	public void setup() {

	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.liberis.com/become-a-partner");
	driver.manage().window().maximize();
	
	String actualurl=driver.getCurrentUrl();
	String expectedurl="https://www.liberis.com/become-a-partner";
	
    assertEquals(actualurl,expectedurl);

	
	
	}
	
	//Verify user has landed on Partner Selection page and it has the required 3 Types of Partners
	
	@Test
	public void m1() {
		
	List<WebElement>list = driver.findElements(By.xpath("//div[@class='right flex-start']"));
	
	int a=list.size();
	
	for(int i=0;i<a;i++) {
		
	System.out.println(list.get(i).getText());
		
	}
		
	
	}
	
	@AfterMethod
	public void setdown() {
		
		driver.quit();
	}
	
	
	
	
}
