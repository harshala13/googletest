package com.crm.qa.testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage ContactsPage;
	TestUtil TestUtil;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		loginPage = new LoginPage();
		homePage=loginPage.loginToPage(prop.getProperty("USERNAME"),prop.getProperty("PASSWORD"));
		TestUtil.switchtoframe();
	}

	@Test
	public void verifyContacts() throws Exception {
		ContactsPage = homePage.verifyContacts();

	}

}
