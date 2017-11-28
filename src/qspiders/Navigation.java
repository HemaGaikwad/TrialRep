package qspiders;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("google"))
		{
			System.out.println("yes, it's navigated to google");
		}
		else
		{
			System.out.println("no, it's not navigated to google");
		}
		driver.close();
	}
}