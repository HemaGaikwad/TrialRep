package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpathLocator 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("file:///E:/Practice/Xpath.html");
		WebElement chkbox=driver.findElement(By.xpath("/html/body/div[1]/input[1]"));
		chkbox.click();
		driver.close();
	}
}