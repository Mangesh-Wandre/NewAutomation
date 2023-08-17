package com.auto.www;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.github.dockerjava.api.model.Driver;

public class TakeScreenshortDemo
{
	WebDriver driver=null;
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.get("https://stackoverflow.com/tags");
	}
	
	@Test
	public void getScreenShortDemo() throws IOException
	{
		WebElement box = driver.findElement(By.xpath("/html/body/header/div/a[2]"));
		TakesScreenshot ts=(TakesScreenshot)box;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\NewAutoMation\\NewAutomation\\Drivers\\ScreenShot/Box.jpg");
		//org.openqa.selenium.io.FileHandler.copy(scr, dest);
		FileUtils.copyFile(scr, dest);
		System.out.println("!!!!!!!ScreenShot Taken !!!!!!");
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
