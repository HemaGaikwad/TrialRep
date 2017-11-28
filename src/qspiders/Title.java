package qspiders;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Title 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}