package resources3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class base {
	
	public Properties prop;
	public WebDriver driver; 
	public WebDriver intializeDriver() throws IOException {
		
	prop = new Properties();
	
	FileInputStream fis = new FileInputStream("C:\\Users\\SONY\\Documents\\Java_Selenium\\E2EProject\\src\\main\\java\\resources3\\data.properties");
		
	prop.load(fis);
	//String browsername = prop.getProperty("browser");
	String browserName = prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Documents\\chromedriver.exe");
	driver = new ChromeDriver();
		
	}
	else if (browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SONY\\Documents\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if (browserName.equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\SONY\\Documents\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	
public void getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
	
TakesScreenshot ts =	(TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
FileUtils.copyFile(source, new File(destinationFile));
	
}
}
