package qspiders;

import org.openqa.selenium.firefox.FirefoxDriver;

public class URL 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
}