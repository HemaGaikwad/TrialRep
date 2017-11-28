package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement link=driver.findElement(By.linkText("Forgotten account?"));
		String text=link.getText();
		System.out.println(text);
		link.click();
		driver.close();
	}
}