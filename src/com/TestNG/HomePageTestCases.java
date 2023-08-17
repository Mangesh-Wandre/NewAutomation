package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTestCases {
 
	public static WebDriver driver;
	
	@BeforeClass
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		//					D:\NewAutoMation\NewAutomation\Drivers\chromedriver.exe
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void lounchBrowser()
	{
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void verifyHomePageTitle()  
	{
		String expectedTitle="Automation Practice Site";
		String actualTitle=driver.getTitle();
		
		if(expectedTitle.equalsIgnoreCase(actualTitle))
		{
			System.out.println("Validation HomePage Title....Passed");
		}else
		{
			System.out.println("Validation HomePage Title....Failed");
		}
	}
	
	@Test(priority=2)
	public void verifyHomePageUrl()
	{
		String expectedPageUrl="https://practice.automationtesting.in/";
		String actualPageUrl=driver.getCurrentUrl();
		if(expectedPageUrl.equalsIgnoreCase(actualPageUrl))
		{
			System.out.println("Validation HomePage url....Passed");
		}else
		{
			System.out.println("Validation HomePage url....Failed");
		}
	}
	
	@Test(priority=3)
	public void pageWithThreeSliders()
	{
		System.out.println("pageWithThreeSliders  code to be written");
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}
