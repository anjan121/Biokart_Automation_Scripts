package scripts.WebAppsPage_scenarios.functional_scenarios;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
//import generic.AutomationConstants;
import pom.HomePage;
import pom.WebAppsPage;

public class AS_NavigateToWebAppsPageFromHomePage extends OpenClose
{
	@Test
	public void test_NavigateToWebAppsPageFromHomePage() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		Assert.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		
		WebAppsPage wap = new WebAppsPage(driver);
		
		String ETitle1=(String) Excel.getData("WebAppsPage", 1, 0);
		String EUrl=(String) Excel.getData("WebAppsPage", 1, 1);
		
		Assert.assertTrue(wap.verifyTitleOfWebpage(ETitle1),"Expected Title not Verified");
		Assert.assertTrue(wap.verifyUrlOfWebpage(EUrl),"Expected Url not Verified");
	}
}
