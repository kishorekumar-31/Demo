package com.app.hubspot.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.hubspot.qa.base.TestBase;
import com.app.hubspot.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		test = reports.createTest("loginPageTitleTest");
		String loginPageTitle = new LoginPage().verifyLoginPageTitle();
		Assert.assertEquals(loginPageTitle, "HubSpot Login1");
	}
	
	@Test(priority=2)
	public void loginPageTest() {
		test = reports.createTest("loginPageTest");
		new LoginPage().doLogin(pro.getProperty("username"), pro.getProperty("password"));
		
	}

}
