package testng.practice1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class googletestparallel extends Bsetest {



	

	@Test(priority = 1)
	public void Gettitletest() {
		
	

		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@Test(priority = 2)
	public void GetUrltest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));

	}
	
	@Test (priority = 3)
	public void searchtest()
	{
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		driver.findElement(By.name("q")).click();
		Assert.assertEquals(driver.getTitle(), "Google");
		
	}
	
	

}
