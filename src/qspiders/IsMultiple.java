package qspiders;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple 
{

	public static void main(String[] args) 
	{
		/*System.setProperty("webdriver.chrome.driver","E:/Practice/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fatcow.com/");*/
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///E:/Practice/SelectClass.html");
		WebElement listbox=driver.findElement(By.name("country"));
		Select select=new Select(listbox);
		boolean v=select.isMultiple();
		System.out.println(v);
		driver.close();
	}
}