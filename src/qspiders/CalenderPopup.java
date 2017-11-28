package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderPopup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("BE_flight_depart_date")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("a_2017_11_15")).click();
	}
}