package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	JavascriptExecutor executor;
	public LoginPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	WebElement user;

	@FindBy(name="password")
	WebElement password;     

	@FindBy(xpath="//*[@id='loginForm']/div/div/input")
	WebElement login;                                        

	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUp;
	 
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	WebElement contacts;
	
	@FindBy(xpath="//div[@class='navbar-header']/a/descendant::img[@class='img-responsive']")
	WebElement logo;
	
	public String getLoginPageTitle(){
	return driver.getTitle();
	}
	
	public boolean verifyPageLogo(){
		return logo.isDisplayed();}
	
	
	public HomePage loginToPage(String un,String pwd) throws Exception{
	user.sendKeys(un);
	password.sendKeys(pwd);
    executor=(JavascriptExecutor) ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='Login']")));
	return new HomePage();
	}
	
	
	
	}
	
	
	
	
	
	

