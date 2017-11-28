package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkTextLocator 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement link=driver.findElement(By.partialLinkText("Forgotten"));
		String text=link.getText();
		System.out.println(text);
		driver.close();
	}
}