package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RetrieveValue 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.vtiger.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		WebElement un=driver.findElement(By.id("username"));
		un.sendKeys("vtiger");
		String a=un.getAttribute("value");
		System.out.println(a);
		driver.close();
	}
}