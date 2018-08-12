package com.crm.qa.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class GooglePage extends TestBase{

	 
	
	@FindBy(xpath="//div[@id='lga']/img")
	WebElement logoIsDisplayed;
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
	@FindBy(tagName="img")
	List<WebElement> images;
	
	public GooglePage(){
		PageFactory.initElements(driver, this);}
	
	public boolean verifyLogo(){
		return logoIsDisplayed.isDisplayed();}
	
    public String verifyTitle(){
		return driver.getTitle();}
    
    
    public void verifyBrokenLink() throws Exception, IOException{
    	
    	
    	for(int i=0;i< links.size();i++)
    	System.out.println("No of Links avaible on page: "+links.size());	
    	for(WebElement lists: links)
    	if(lists.getAttribute("href")!=null && lists.getAttribute("href").contains("javascript"))
    	links.add(lists);
    	HttpURLConnection  http=(HttpURLConnection) new URL("href").openConnection();
    	http.connect();
    	//String response= http.getResponse();
    
    }
	
	




}