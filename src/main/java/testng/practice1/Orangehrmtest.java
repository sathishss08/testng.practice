package testng.practice1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orangehrmtest extends Bsetest  {

	

	

	@Test
	public void Gettittletest()

	{
//		driver.get("https://www.orangehrm.com/");
		Assert.assertTrue(driver.getTitle().contains("Human"));
	}

	@Test(dependsOnMethods = "Gettittletest")
	public void emailpageurltest() {

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).submit();
		Assert.assertTrue(driver.getCurrentUrl().contains("30-day-free-trial"));

	}

}
