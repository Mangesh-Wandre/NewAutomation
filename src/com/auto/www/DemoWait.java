package com.auto.www;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class DemoWait {

	public static void main(String[] args) throws InterruptedException {
//		ChromeDriverManager.chromedriver().setup();
//		ChromeOptions op=new ChromeOptions();
//		op.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\NewAutoMation\\NewAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html?m=1");
		
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)","");
		
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
		WebElement box1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Textbox1'])[1]")));
		box1.sendKeys("Mangesh");
		
		
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(11));
		WebElement box2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Textbox2'])[1]")));
		box2.sendKeys("Wandre");
		//  driver.findElement(By.xpath("(//input[@placeholder='Textbox1'])[1]")).sendKeys("5 Sec");
		 // driver.findElement(By.xpath("//button[@id=\"btn2\"]")).click();
		//  driver.findElement(By.xpath("(//input[@placeholder='Textbox2'])[1]")).sendKeys("10 Sec");
		
		
	}

}
