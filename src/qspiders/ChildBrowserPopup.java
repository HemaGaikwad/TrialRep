package qspiders;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserPopup 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		String mainWindowHandle=driver.getWindowHandle();
		System.out.println(mainWindowHandle);
		Set<String> windowHandles=driver.getWindowHandles();
		int a=windowHandles.size();
		System.out.println(windowHandles);
		System.out.println(a);
		for(String currentWindow:windowHandles)
		{
			if(currentWindow.equals(mainWindowHandle))
			{
				driver.switchTo().window(currentWindow);
				String mainWindow=driver.getTitle();
				System.out.println(mainWindow);
				System.out.println("its a main window");
				//driver.close();
			}
			else
			{
				driver.switchTo().window(currentWindow);
				String childWindow=driver.getTitle();
				System.out.println(childWindow);
				//driver.close();
			}			
		}
	}
}