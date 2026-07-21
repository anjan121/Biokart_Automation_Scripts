package scripts.WebAppsPage_scenarios.functional_scenarios;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
import pom.HomePage;
import pom.WebAppsPage;

public class AS_ClickOnEcoders extends OpenClose 
{
	@Test
	public void test_clickonEcoders() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		Assert.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		
		WebAppsPage wap = new WebAppsPage(driver);
		
		Assert.assertTrue(wap.ClickOnEcoders(),"Not able to click on Ecoders");
	}
}
