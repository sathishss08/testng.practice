package testng.practice1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Opencarttest extends Bsetest {
	
	


	

	@Test(priority = -1)
	public void opencarttitletest() {
		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		Assert.assertEquals(driver.getTitle(), "Account Login");
	}

	@Test(priority = 0)
	public void opncartUrltest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("route=account/login"));

	}
	
	
	}
	


