package com.auto.www;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class WaitsInSelenium {

	public static void main(String[] args) {
		
		ChromeDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(op);
		//automation code/testing code
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html?m=1");
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS); before selenium  4
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));//selenium 4
		
		/*
		 * // implicit Wait
		 * driver.findElement(By.xpath("//button[@id=\"btn1\"]")).click();
		 * driver.findElement(By.xpath("(//input[@placeholder=\"Textbox1\"])[1]")).sendKeys("5 Sec");
		 * driver.findElement(By.xpath("//button[@id=\"btn2\"]")).click();
		 * driver.findElement(By.xpath("(//input[@placeholder=\"Textbox2\"])[1]")).sendKeys("10 Sec");
		 */
		
		/*
		 * // Explicit wait
		 * driver.findElement(By.xpath("//button[@id=\"btn1\"]")).click();
		 * //WebDriverWait wait=new WebDriverWait(driver,5);// Before selenium 4 not
		 * works WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(6));
		 * WebElement  box1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder=\"Textbox1\"])[1]")));
		 * box1.sendKeys("5 Sec");
		 * driver.findElement(By.xpath("//button[@id=\"btn2\"]")).click();	
		 * WebDriverWait wait2= new WebDriverWait(driver,Duration.ofSeconds(11));
		 * WebElement box2=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder=\"Textbox2\"])[1]")));
		 * box2.sendKeys("10 Sec");
		 */
		
	//FluentWait   selenium   smart wait 
	Wait<WebDriver>  fluentWait= new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(11))   // max time
			.pollingEvery(Duration.ofSeconds(3))   //3 interval ===>
			.ignoring(NoSuchElementException.class);
			
	driver.findElement(By.xpath("//button[@id=\"btn1\"]")).click();
	WebElement box1_F=fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder=\"Textbox1\"])[1]")));
	box1_F.sendKeys("5 Sec");
	
	driver.findElement(By.xpath("//button[@id=\"btn2\"]")).click();
	WebElement box2_F=fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder=\"Textbox2\"])[1]")));
	box2_F.sendKeys("10 Sec");
	
	}
}
