package com.testyantra.webelementmethods;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.agent.builder.AgentBuilder.Listener;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.utility.JavaModule;

public class WebElementMethods
	
{
	public static WebDriver driver=null;
	
	public static void clearMethod()
	{
		try
		{
		//driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).click();
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		Thread.sleep(5000);
		driver.findElement(By.id("lst-ib")).clear();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void getAttributeMethod()
	{
		WebElement searchbox = driver.findElement(By.id("lst-ib"));
		String attribute = searchbox.getAttribute("id");
		System.out.println(attribute);
	}
	
	public static void getCSSmenthod()
	{
		WebElement searchbox = driver.findElement(By.id("hplogo"));
		String cssvalue = searchbox.getCssValue("color");
		System.out.println(cssvalue);
	}
	
	public static void getLocationMethod()
	{
		WebElement searchbox = driver.findElement(By.id("lst-ib"));
		int x = searchbox.getLocation().getX();
		System.out.println(x);
	}

	public static void getTagName()
	{
		WebElement searchbox = driver.findElement(By.id("lst-ib"));
		String tag = searchbox.getTagName();
		System.out.println(tag);
	}
	
	public static void getText()
	{
		WebElement searchbox = driver.findElement(By.xpath("(//a[@href='https://mail.google.com/mail/?tab=wm'])[1]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(searchbox.getText());
	}
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//clearMethod();
		//getAttributeMethod();
		//getCSSmenthod();
		//getLocationMethod();
		//getTagName();
		getText();
		
		
	}


}
