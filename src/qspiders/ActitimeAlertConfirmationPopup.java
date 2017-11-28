package qspiders;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeAlertConfirmationPopup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='initial']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jspiders");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		
		try
		{
			Alert alt=driver.switchTo().alert();
			String str=alt.getText();
			System.out.println(str);
			alt.accept();
			//alt.dismiss();
		}
		catch(Exception e)
		{
			
		}
		driver.close();
	}
}