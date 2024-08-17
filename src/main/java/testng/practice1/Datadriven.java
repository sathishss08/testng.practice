package testng.practice1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven extends Bsetest {
	
//	WebDriver driver;
//	
//	ChromeOptions co;
//	@BeforeTest
//	
//	public void setup()
//	
//	{
//		co = new ChromeOptions();
//		co.addArguments("--headless");
//		driver = new ChromeDriver(co);
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();		
//	}
	
	@DataProvider
	public Object[][]  logindata()
	{
		
		return new Object [] []  {
			{ "test@gmail.coom", "test123"},
			
			{ "12345@gmail.coom", " "},
			{ "llllll@gmail.coom", "000000"},
			
			
		};
		
	}
	
	@Test(dataProvider = "logindata" )
	public void logintest( String username ,String passwd)
	{
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(passwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String name =driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();
		
		System.out.println("the exact msg is :" + name);
		
		Assert.assertTrue(name.contains("Warning: No match for E-Mail Address and/or Password"));
		
	}
	
	
	
	

}
