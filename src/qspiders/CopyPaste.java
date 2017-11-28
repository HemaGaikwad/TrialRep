package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyPaste 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		
//		driver.get("http://127.0.0.1/login.do;jsessionid=a1ftr6b7rs13s");
//		WebElement un=driver.findElement(By.xpath("//input[@name='username']"));
//		un.sendKeys("admin");
//		un.sendKeys(Keys.CONTROL, "a");
//		un.sendKeys(Keys.CONTROL,"c");
//		WebElement pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
//		pwd.sendKeys(Keys.CONTROL,"v");
//		String a=pwd.getAttribute("value");
//		System.out.println(a);
				
		driver.get("https://www.facebook.com/");
		WebElement un=driver.findElement(By.id("email"));
		un.sendKeys("9438326758");
		un.sendKeys(Keys.CONTROL, "a");
		un.sendKeys(Keys.CONTROL, "c");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys(Keys.CONTROL, "v");
		String a=pwd.getAttribute("value");
		System.out.println(a);
		driver.close();		
	}
}