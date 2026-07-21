package scripts.homepage_scenarios.regression_scenarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleThreeTabs {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" ");
		String mainWindow=driver.getWindowHandle();
		
		driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
		driver.get(" ");
		
		driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
		driver.get(" ");
		
		Set<String> allwindows=driver.getWindowHandles();
		List<String> tabs=new ArrayList<>(allwindows);
		
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(tabs.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	
	

}
