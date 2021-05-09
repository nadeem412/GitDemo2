package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import resources3.base;

public class navigationPa extends base {
	WebDriver driver;
	
	@Test
	public void screenshoot() throws IOException {
	driver =intializeDriver();
	driver.get(prop.getProperty("url"));
	
	LandingPage l = new LandingPage(driver);
	//l.start().click();
	
Assert.assertTrue(l.getnavigation().isDisplayed());
			Assert.assertEquals(l.getcheck().getText(), "Learn & Shine");
	}

}
