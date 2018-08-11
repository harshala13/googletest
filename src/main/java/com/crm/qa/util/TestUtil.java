package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	public static final long PAGE_LOAD_TIMEOUT = 5;
	public static final long IMPLICIT_WAIT = 5;
	
	public void switchtoframe()
	{driver.switchTo().frame("mainpanel");	}

}
