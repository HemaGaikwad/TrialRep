package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AlternateOptions 
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
		for(int i=0;i<=size-1;i=i+2)
		{
			WebElement ele=getopt.get(i);
			String options=ele.getText();
			System.out.println(options);
		}	
		driver.close();
	}
}