package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumProject 
{
	public static WebDriver driver=null;
	
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
	}
	@Test(priority = 1)
	public void verifyTitle()
	{
		String expectedTitle="Automation Practice Site";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
			System.out.println("!!!!Title Vierification TestCase is PASS!!!!");
		else
			System.out.println("!!!!Title Vierification TestCase is FAIL!!!!");
//		Assert.assertEquals(actualTitle, expectedTitle,"!!!!Title Vierification TestCase is PASS!!!!");
//		Reporter.log("!!!!Title Vierification TestCase is PASS!!!!",true);
		
	}
	@Test(priority = 2)
	public void verifyUrl()
	{
		String expectedURL="https://practice.automationtesting.in/";
		String actualURL=driver.getCurrentUrl();
		if(actualURL.equals(expectedURL))
			System.out.println("!!!!URL Vierification TestCase is PASS!!!!");
		else
			System.out.println("!!!!URL Vierification TestCase is FAIL!!!!");
		//Assert.assertEquals(actualURL, expectedURL,"!!!!URL Vierification TestCase is PASS!!!!");
		//Reporter.log("!!!!URL Vierification TestCase is PASS!!!!",true);
	}
	
	@Test(priority = 3)
	public void verifyThreeSlider() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> slider = driver.findElements(By.xpath("//img[@loading='lazy']"));
		
		if(slider.size()==3)
			System.out.println("3 Slider are Present,so Test case pass");
		else
			System.out.println("3 Sliders are not Present,so Test case fail");

		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
	}

}
