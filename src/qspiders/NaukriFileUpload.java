package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NaukriFileUpload 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		WebElement uploadCV=driver.findElement(By.id("input_resumeParser"));
		Thread.sleep(2000);
		uploadCV.sendKeys("D:\\SamplenaukriDoc.txt");
		Thread.sleep(5000);
		driver.close();
	}
}