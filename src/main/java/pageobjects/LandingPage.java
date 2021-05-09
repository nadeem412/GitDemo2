package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources3.base;

public class LandingPage {
	
	
	WebDriver driver;
	
	public LandingPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy (xpath= "//a[@class='theme-btn register-btn']")

WebElement Login;

@FindBy (xpath = "//div [@class='col-md-6 text-left']/h2/span/strong")
WebElement text;
@FindBy (xpath = "//ul [@class='navigation clearfix']/li")
WebElement navigation;

public WebElement start() {
	
	return Login;  //return driver.findElement (login)
}

public WebElement getcheck() {
	
	return text;
}

public WebElement getnavigation() {
	
	
	return navigation;
}


}