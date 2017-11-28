package qspiders;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByContainsLocator 
{

	public static void main(String[] args) 
	{
		//WebDriver driver= new FirefoxDriver();
		FirefoxDriver driver=new FirefoxDriver();		
		driver.get("file:///E:/Practice/XpathContains.html");
		WebElement signin=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		//WebElement signin=driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
		//WebElement signin=driver.findElement(By.xpath("//button[contains(text(),'Sign')][contains(text(),'in')]"));		
		signin.click();
		if(signin.isEnabled())
		{
			System.out.println("its clicked");
		}
		else
		{
			System.out.println("not clicked");
		}
		driver.quit();
	}
}