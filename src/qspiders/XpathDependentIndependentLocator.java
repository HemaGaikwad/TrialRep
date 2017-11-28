package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDependentIndependentLocator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("http://www.seleniumhq.org/download/");		
		WebElement java=driver.findElement(By.xpath("//td[text()='Java']/../td[4]"));
		if(java.isDisplayed())
		{
			System.out.println("element is visible");
		}
		else
		{
			System.out.println("element is not visible");
		}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);
		java.click();
		//driver.close();
	}
}