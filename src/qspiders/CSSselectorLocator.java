package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSselectorLocator 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.cssSelector("input[type='email']"));
		email.sendKeys("9438326758");
		email.clear();
		driver.close();
	}
}