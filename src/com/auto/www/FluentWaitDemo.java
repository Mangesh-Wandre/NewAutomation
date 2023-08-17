package com.auto.www;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\NewAutoMation\\NewAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)","");
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html?m=1");
		driver.manage().window().maximize();
	FluentWait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(11))
			.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
				
		
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
	
		WebElement box1 = fluentwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Textbox1'])[1]")));
		box1.sendKeys("Mangesh");
		
		
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
	
		WebElement box2 = fluentwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Textbox2'])[1]")));
		box2.sendKeys("Wandre");

	}

}
