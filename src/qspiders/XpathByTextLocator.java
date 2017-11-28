package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByTextLocator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement fn=driver.findElement(By.xpath("//div[text()='First name']"));
		fn.sendKeys("Jyotiprakash");
	}
}