package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleElements 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		
		driver.findElement(By.id("identifierId")).sendKeys("jyotiprakash.jp18@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pupul12011993");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(20000);
		List<WebElement> allchkbox=driver.findElements(By.xpath("//div[@class='T-Jo-auh']"));
		Thread.sleep(20000);
		int chkboxcount=allchkbox.size();
		System.out.println(chkboxcount);
		for(int i=1;i<=chkboxcount-1;i=i+2)
		{
			WebElement b=allchkbox.get(i);
			b.click();
			/*Thread.sleep(5000);
			if(b.isDisplayed())	
			{
				System.out.println("element is displayed");
			}
			else
			{
				System.out.println("element is not displayed");
			}
			if(b.isEnabled())	
			{
				System.out.println("element is enabled");
			}
			else
			{
				System.out.println("element is not enabled");
			}
			Thread.sleep(10000);
			b.click();
			Thread.sleep(5000);
			if(b.isSelected())
			{
				System.out.println("element is selected");
			}
			else
			{
				System.out.println("element is not selected");
			}	*/			
		}
	}
}