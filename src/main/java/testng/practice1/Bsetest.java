package testng.practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Bsetest {

	WebDriver driver;

	@Parameters({ "browser" , "url" })
	@BeforeTest

	public void setup(String Browsername, String url) {

		System.out.println("running browser" + Browsername);
		switch (Browsername.toLowerCase()) {
		case "chrome":

			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("pls pass the right browser" + Browsername);
		}
		
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@AfterTest
	public void teardown() {

		driver.quit();
	}

}
