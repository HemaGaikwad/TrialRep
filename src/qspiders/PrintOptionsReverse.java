package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionsReverse 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///E:/Practice/SelectClass.html");
		WebElement listbox=driver.findElement(By.name("country"));
		Select select=new Select(listbox);
		List<WebElement> getopt=select.getOptions();
		int size=getopt.size();
		System.out.println(size);
		for(int i=size-1;i>=0;i--)
		{
			WebElement ele=getopt.get(i);
			String options=ele.getText();
			System.out.println(options);
		}	
		driver.close();
	}
}