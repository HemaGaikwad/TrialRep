package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeHiddenDivisionPopup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='initial']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='taskSelected[2]']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Delete Selected Tasks']")).click();
		Thread.sleep(5000);
		String msg=driver.findElement(By.id("deleteMessage")).getText();
		System.out.println(msg);
		driver.findElement(By.id("deleteButton")).click();
		driver.close();
	}
}