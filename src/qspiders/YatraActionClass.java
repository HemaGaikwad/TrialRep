package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class YatraActionClass 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement support=driver.findElement(By.xpath("//a[@class='dropdown-toggle eventTrackable']"));
		Actions act=new Actions(driver);
		act.moveToElement(support).perform();
		WebElement contactus=driver.findElement(By.xpath(".//*[@id='cutomerSupportNav']/div/div[2]/ul/li[1]/a"));
		act.click(contactus).perform();
		driver.close();
	}
}