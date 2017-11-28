package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelected {

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=a1ftr6b7rs13s");
		WebElement chkbox=driver.findElement(By.xpath("//input[@name='remember']"));
		boolean displayed=chkbox.isDisplayed();
		if(displayed)
		{
			System.out.println("checkbox is displayed");
		}
		else
		{
			System.out.println("checkbox is not displayed");
		}
		
		boolean enabled=chkbox.isEnabled();
		if(enabled)
		{
			System.out.println("checkbox is enabled");
		}
		else
		{
			System.out.println("checkbox is not enabled");
		}
		chkbox.click();
		//boolean selected=chkbox.isSelected();
		if(chkbox.isSelected())
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}
		driver.close();
	}
}