package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
		/*WebElement mobiles=driver.findElement(By.xpath("//span[text()='Mobiles']"));
		act.click(mobiles).perform();
		WebElement samsung=driver.findElement(By.xpath("//span[text()='Samsung']"));
		act.click(samsung).perform();*/
		/*WebElement lenovo=driver.findElement(By.xpath("//span[text()='Lenovo']"));
		act.click(lenovo).perform();*/
		WebElement apple=driver.findElement(By.xpath("//span[text()='Apple']"));
		act.clickAndHold(apple).perform();
		act.contextClick(apple).perform();
		act.sendKeys("t").perform();
		//act.sendKeys("w").perform();
		driver.close();
	}
}