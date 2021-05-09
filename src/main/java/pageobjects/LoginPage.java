package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources3.base;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy (id="user_email") //by username = by.id("user_email")
WebElement username;

@FindBy (id="user_password")
WebElement password;

@FindBy (xpath= "//div [@class='form-group text-center']/input")
WebElement Submit;


public WebElement getusername() {
	
	return username;
}

public WebElement getpassword() {
	
	return password;
}
public WebElement getsignin() {
	
	return Submit;
}


}
