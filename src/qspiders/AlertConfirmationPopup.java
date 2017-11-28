package qspiders;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertConfirmationPopup 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		try
		{
			Alert alt=driver.switchTo().alert();
			String str=alt.getText();
			System.out.println(str);
			alt.accept();
			alt.accept();			
		}
		catch(Exception e)
		{
			
		}
		driver.close();
	}
}