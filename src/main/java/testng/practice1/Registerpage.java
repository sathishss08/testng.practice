package testng.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Registerpage {
	
	WebDriver driver;

//	@BeforeTest
	
//	public void setup() {
//		
//		driver = new ChromeDriver();
//		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().deleteAllCookies();
		
//	}
		@DataProvider
		public Object [][] registerdata()
		{
			return new Object [] [] {
				
				{"aaaaa","bbbbbb","test@gmail.com","89898989898","password","password"},
				
			};
		}
			
			@Test(dataProvider = "registerdata")
			public void registertest(String firstname, String lastname,String email,String phone ,String passwd, String confirmpsswd)
			{
				driver = new ChromeDriver();
				driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
				driver.findElement(By.id("input-firstname")).sendKeys(firstname);
				driver.findElement(By.id("input-lastname")).sendKeys(lastname);
				driver.findElement(By.id("input-email")).sendKeys(email);
				driver.findElement(By.id("input-telephone")).sendKeys(phone);
				driver.findElement(By.id("input-password")).sendKeys(passwd);
				driver.findElement(By.id("input-confirm")).sendKeys(confirmpsswd);
				
				driver.findElement(By.xpath("//input[@name='agree']")).click();
				
				driver.findElement(By.xpath("//input[@value='Continue']")).submit();
				
				Assert.assertTrue(driver.getCurrentUrl().contains("https://naveenautomationlabs.com/opencart/index.php?route=account/register"));
			
			
			
			{
				
				
				
			
			
			
			
		}
		
		

	}

}
