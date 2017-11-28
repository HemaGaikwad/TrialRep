package com.testyantra.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopups {

	public static WebDriver driver=null;
	
	public static void handlepopups()
	{
		driver.findElement(By.xpath("//div[@class='popup']")).click();
		System.out.println(driver.findElement(By.id("myPopup")).getText());
		
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/SamplePage.html");
		handlepopups();
		

	}

}
