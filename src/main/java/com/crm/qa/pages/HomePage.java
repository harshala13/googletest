package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Contacts']")
	WebElement contacts;
	
	public ContactsPage verifyContacts() throws Exception
	{
		contacts.click();
		return new ContactsPage();
		
	}

}
