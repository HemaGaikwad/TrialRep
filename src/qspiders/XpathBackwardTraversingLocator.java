package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathBackwardTraversingLocator 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("file:///E:/Practice/Xpath.html");
		WebElement chkbox=driver.findElement(By.xpath("//div[3]/input[2]/../../.."));
		chkbox.click();

	}

}
