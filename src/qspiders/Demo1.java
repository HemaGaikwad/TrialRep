package qspiders;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		
		//enter URL
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		
		//enter URL
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(1000);
		
		//move back
		driver.navigate().back();
		Thread.sleep(1000);
		
		//move forward
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//refresh
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		//close browser
		driver.close();
	}
}