package com.crm.qa.testcases;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	public LoginTest(){
		super();}
	
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		loginPage = new LoginPage();}
	
	@Test(priority=1,enabled=false)
	public void verifyTitleTest(){
		String s =loginPage.getLoginPageTitle();
		Assert.assertEquals(s, "Free CRM software in the cloud powers sales and customer service");
	}
	@Test(priority=2,enabled=false)
	public void verifyLogoTest(){
		boolean flag=loginPage.verifyPageLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void verifyLoginTest() throws Exception{
		homePage=loginPage.loginToPage(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	}
	
	
	@AfterMethod
	public void teardown()
	{driver.close();}
	

	
}
