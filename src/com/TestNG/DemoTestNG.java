package com.TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class DemoTestNG 
{
	@Test
	public void m1()
	{
		Reporter.log("Test 'Test m 1'",true);
		
	}
	
	@Test
	public void m6()
	{
		Reporter.log("Test 'Test m 6'",true);
		
	}
@BeforeTest
public void m2()
{
	Reporter.log("Before test M2",true);
	
}

@AfterTest
public void m3()
{
	Reporter.log("After test M3",true);
	
}
@BeforeMethod
public void m4()
{
	Reporter.log("Before Method M4",true);
	
}
@AfterMethod
public void m5()
{
	Reporter.log("After Method M5",true);
	
}


}
