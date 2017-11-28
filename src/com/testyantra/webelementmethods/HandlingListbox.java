package com.testyantra.webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox 
{
	public static WebDriver driver=null;
	public static void handleListBox()
	{
		WebElement list = driver.findElement(By.id("cars"));
		Select oSelect = new Select(list);
		List<WebElement> drop  = oSelect.getOptions();
		System.out.println(drop.size());
	}
	
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("file:///C:/Users/TYSS/Desktop/SamplePage.html");
			handleListBox();
	}

}
