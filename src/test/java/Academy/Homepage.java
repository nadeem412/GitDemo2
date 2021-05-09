package Academy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources3.base;

public class Homepage extends base{
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	@Test(dataProvider = "getData")
	
		public void basepagenavigation(String name, String password, String text) throws IOException {
		
		driver =intializeDriver();
		driver.get(prop.getProperty("url"));
		
		LandingPage l = new LandingPage(driver);
		//l.start().click();
		
	Assert.assertTrue(l.getnavigation().isDisplayed());
				Assert.assertEquals(l.getcheck().getText(), "Learn & Shine");
				
				System.out.println("I am here");
				System.out.println("Where are they");
				
				
				//Assert.assertEquals(0, 0)
		
		
		/*LoginPage lp = new LoginPage(driver); 
		lp.getusername().sendKeys(name);
		lp.getpassword().sendKeys(password);
		lp.getsignin().click();
		log.info(text);	
		log.info("homepage driver started for user");
		log.info("logged into the link chrome for user");
		log.info("logged into the navigated link rahulshetty for user");
		log.info("sucessfully injected the id and pass for user"); */
		}
	
/*
	@DataProvider
	
	public Object[][] getData() throws InterruptedException {
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "nonrestricteduser@qa.com";
		data [0][1] = "1234";
	 data[0][2] = "non-Restricted user";
		
		data[1][0] = "restricteduser@qa.com";
		data[1][1] = "1234";
		data[1][2] = "Restricted user"; 
		
		return data;
	
	}*/
	
	@AfterTest
	public void outoff() {
		
		driver.close();
	}
	
}
