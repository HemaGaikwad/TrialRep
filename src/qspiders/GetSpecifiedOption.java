package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSpecifiedOption 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///E:/Practice/SelectClass.html");
		WebElement listbox=driver.findElement(By.name("country"));
		Select select=new Select(listbox);
		List<WebElement> allOptions=select.getOptions();
		String a="Canada";
		/*String msg="Not Found";
		for(int i=0;i<allOptions.size();i++)
		{
			String b=allOptions.get(i).getText();
			if(a.equals(b))
			{
				msg="Found";
				break;
			}
		}
		System.out.println(msg);*/
		
		
		for(int i=0;i<allOptions.size();i++)
		{
			String b=allOptions.get(i).getText();
			if(a.equals(b))
			{
				System.out.println("Option Found");
			}
			else
			{
				System.out.println("Option Not Found");
			}
		}
		driver.close();
	}
}