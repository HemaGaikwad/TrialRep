package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByGroupIndexLocator 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement pass=driver.findElement(By.xpath("(//input[@class='inputtext'])[2]"));
		pass.sendKeys("pupul");
		driver.close();
	}
}