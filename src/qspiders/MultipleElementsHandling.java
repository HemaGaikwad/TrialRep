package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleElementsHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(5000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		Thread.sleep(5000);
		List<WebElement> allchkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(5000);
		int chkboxcount=allchkbox.size();
		System.out.println(chkboxcount);
		for(int i=2;i<=chkboxcount-1;i++)
		{
			WebElement b=allchkbox.get(i);
			Thread.sleep(5000);
			/*if(b.isDisplayed())	
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
			Thread.sleep(10000);*/
			b.click();
			if(b.isSelected())
			{
				System.out.println("element is selected");
			}
			else
			{
				System.out.println("element is not selected");
			}
		}
	}
}