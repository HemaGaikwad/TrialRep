package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginWithoutClickingLoginButton 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=a1ftr6b7rs13s");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(Keys.ENTER);		
	}
}