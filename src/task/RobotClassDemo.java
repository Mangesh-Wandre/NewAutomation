package task;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.Assert;

public class RobotClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Facebook']")));
//		boolean act = logo.isDisplayed();
//		
//		FluentWait<WebDriver> ft=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(3))
//				.ignoring(NoSuchElementException.class);
//		ft.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Facebook']")));
//		
//		Assert.assertTrue(act);
		
		
	}

}
