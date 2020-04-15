package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPageObjects;
import Testbase.Commonfunctions;

public class LoginPageTest extends Commonfunctions {
	@Test
	public void login() {
		PageFactory.initElements(driver,LoginPageObjects.class);
		LoginPageObjects.username.sendKeys(properties.getProperty("username"));
		LoginPageObjects.password.sendKeys(properties.getProperty("password"));
	    LoginPageObjects.submit.click();
	    
}

	
}

