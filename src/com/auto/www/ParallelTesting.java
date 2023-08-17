package com.auto.www;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class ParallelTesting {

	public static WebDriver driver=null;
	
	
	public static void test1() throws InterruptedException, AWTException
	{
//		System.setProperty("webriver.gecko", ".\\Drivers\\geckodriver.exe");
//		
//		driver=new FirefoxDriver();
		ChromeDriverManager.edgedriver();
		
		 driver=new FirefoxDriver();
				
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Mangesh Wandre");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
		//driver.quit();
		
		
	}
	public static void test2() throws InterruptedException, AWTException
	{
	
	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Mangesh Mukund Wandre");

	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	//driver.quit();
	}
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
//		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(11))
//				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
//		WebElement box1 = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		test1();
	//	test2();
		
		Thread.sleep(1000);
		
	}

}
