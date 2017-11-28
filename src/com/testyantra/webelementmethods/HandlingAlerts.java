package com.testyantra.webelementmethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts 
{
	public static WebDriver driver=null;
	public static void HandleAlerts()
	{
		try
		{
		driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert is present");
		System.out.println(alert.getText());
		alert.dismiss();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/SamplePage.html");
		HandleAlerts();
	}
	
}
