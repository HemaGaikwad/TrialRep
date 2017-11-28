package qspiders;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Contains 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Home Appliances"))
		{
			System.out.println("yes, it's navigated to flipkart");
		}
		else
		{
			System.out.println("no, it's not navigated to flipkart");
		}
		driver.close();
	}

}
