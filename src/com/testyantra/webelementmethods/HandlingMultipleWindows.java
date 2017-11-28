package com.testyantra.webelementmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static WebDriver driver=null;
	
	public static void handleMultipleWindows()
	{
		String ParentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text() = 'thesitewizard.com']")).click();
		Set<String> handles = driver.getWindowHandles();
		for(String handle1: handles)
		{
			System.out.println(handle1);
			String Url = driver.switchTo().window(handle1).getCurrentUrl();
			System.out.println(Url);
			
		}
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/SamplePage.html");
		handleMultipleWindows();
		
		}

}
