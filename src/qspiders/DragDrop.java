package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.jqueryui.com/droppable/");
		Actions act=new Actions(driver);
		WebElement iFrame=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iFrame);
		Thread.sleep(3000);
		WebElement source=driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		WebElement target=driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		act.dragAndDrop(source, target).perform();		
	}
}