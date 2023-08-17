package task;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public class TagsQuesion 
{
	WebDriver driver=null; 
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://stackoverflow.com/tags?page=2&tab=popular");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 Thread.sleep(1000);
	}
		 @Test
		public void listOfQuesions()
		 {
			 List<WebElement> listQue = driver.findElements(By.xpath("//div[@class='flex--item' and contains(text(),'que')]"));
				System.out.println("List of Quesions with count :-");
				int size=listQue.size();
				ArrayList<String> li=new ArrayList<String>();
				String[] temp=new String[size];
				
				for(int i=0;i<listQue.size();i++)
				{	
				temp[i]= listQue.get(i).getText();
				System.out.println(temp[i]+" ");
				String[] str1 = temp[i].split(" ");
				
				li.add(str1[0]);
				
				}
				System.out.print(li);
				System.out.println();
				String max = li.get(0);
				System.out.println("Maximum Number of Quesion asked :-"+max);
				WebElement subQue = driver.findElement(By.xpath("//div[@class='flex--item' and contains(text(),'"+max+"')]/preceding::div[2]"));
				System.out.println("Subject Name on Which most of Quesions Asked :- "+subQue.getText());
				
		 }	
									 
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
