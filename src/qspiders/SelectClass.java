package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///E:/Practice/SelectClass.html");
		WebElement listbox=driver.findElement(By.name("country"));
		Select select=new Select(listbox);
		select.selectByIndex(1);
		select.selectByValue("AUD");
		select.selectByVisibleText("Canada");
		
		/*select.deselectAll();
		select.deselectByIndex(1);
		select.deselectByValue("AUD");
		select.deselectByVisibleText("Canada");*/
		
		WebElement gtfrstseloptn=select.getFirstSelectedOption();
		String first=gtfrstseloptn.getText();
		System.out.println(first);
		
		List<WebElement> allselected=select.getAllSelectedOptions();
		int size=allselected.size();
		System.out.println(size);
		for(int i=0;i<=size-1;i++)
		{
			WebElement ele=allselected.get(i);
			String textselected=ele.getText();
			System.out.println(textselected);
		}	
		
		List<WebElement> getopt=select.getOptions();
		int size1=getopt.size();
		System.out.println(size1);
		for(int i=0;i<=size1-1;i++)
		{
			WebElement ele=getopt.get(i);
			String options=ele.getText();
			System.out.println(options);
		}		
		driver.close();
	}
}