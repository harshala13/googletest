package com.crm.qa.testcases;

import java.net.HttpURLConnection;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.GooglePage;

public class googleTest extends TestBase{

	GooglePage googlePageObj ;
	SoftAssert assert_test;
	HttpURLConnection link;
	public googleTest(){
		super();}
	
	@BeforeClass
	public void setup(){
		initialization();
		googlePageObj= new GooglePage();
		//assert_test= new SoftAssert();
 }
	
	@Test
	public void verifyTheTitle(){
		String title=googlePageObj.verifyTitle();
		Assert.assertEquals(title, "Google");
		//assert_test.assertAll();
		
	}
	@Test(priority=1)
	public void verifyTheLogo(){
		boolean Flag=googlePageObj.verifyLogo();
		Assert.assertTrue(Flag);}
	
	@Test()
	public void verifyTheLink(){
		//googlePageObj.verifyBrokenLink();
		}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
	
	
}
