package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagNameLocator 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("file:///E:/Practice/Login.html");
		WebElement un=driver.findElement(By.tagName("input"));
		un.sendKeys("qspiders");
		driver.close();
	}
}