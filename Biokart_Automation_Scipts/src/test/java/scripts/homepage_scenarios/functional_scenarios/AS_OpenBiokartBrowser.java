package scripts.homepage_scenarios.functional_scenarios;

import org.testng.annotations.Test;

import generic.OpenClose;
import pom.HomePage;

public class AS_OpenBiokartBrowser extends OpenClose {
	
	@Test
	public void testOpenBiokartBrowser()
	{
		HomePage hp=new HomePage(driver);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
}
