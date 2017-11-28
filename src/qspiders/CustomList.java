package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomList 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		WebElement origin=driver.findElement(By.id("BE_flight_origin_city"));
		origin.sendKeys("Bhubaneswar");
		origin.submit();
		Thread.sleep(5000);
		//driver.findElement(By.id("BE_flight_origin_city")).sendKeys("ENTER");
		//WebElement destination=driver.findElement(By.id("BE_flight_arrival_city"));
		WebElement destination=driver.findElement(By.xpath("//input[@name='flight_destination_city']"));
		Thread.sleep(5000);
		destination.sendKeys("Mumbai");
		Thread.sleep(5000);
		destination.submit();
		Thread.sleep(5000);
		WebElement depdate=driver.findElement(By.id("BE_flight_depart_date"));
		depdate.click();
		WebElement depdateclick=driver.findElement(By.id("a_2017_10_12"));
		depdateclick.click();
		Thread.sleep(10000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(5000);
		WebElement retdate=driver.findElement(By.id("BE_flight_return_date"));		
		retdate.click();
		Thread.sleep(5000);
		WebElement retdateclick=driver.findElement(By.id("a_2017_10_15"));
		retdateclick.click();
		Thread.sleep(5000);
		WebElement search=driver.findElement(By.id("BE_flight_flsearch_btn"));
		search.click();
		driver.close();
		driver.quit();
	}
}