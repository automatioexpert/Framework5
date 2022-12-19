package Regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	@Test
	public void test123()
	{
		// Naren changes
		WebDriver driver=new FirefoxDriver();
		
		// MUkesh Changes
		driver.get("http://www.learn-automation.com");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}

}
