package Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Commonfunctions {
	public static Properties properties=null;
	public static WebDriver driver=null;
	
	public Properties loadPropertyFile() throws IOException {
		//load Property file and Return
	FileInputStream fileinputstream=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/Testbase/Config.properties");
	properties=new Properties();
	properties.load(fileinputstream);
	return properties;	
		
	}
	
	@BeforeSuite
	public WebDriver launchbrowser() throws IOException {
		loadPropertyFile();
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
	if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Chrome/chromedriver.exe");
		driver= new ChromeDriver();
	}else if(browser.equalsIgnoreCase("firefox"));
	{
	    
	}
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	return driver;
	}
	
@AfterSuite
public void teardown()
{
//driver.quit();
}
}
