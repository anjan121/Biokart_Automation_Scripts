package scripts.WebAppsPage_scenarios.functional_scenarios;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
import pom.HomePage;
import pom.WebAppsPage;

public class AS_VerifyText_UI extends OpenClose
{
	@Test
	public void test_VerifyText_UI() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		Assert.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EText=(String) Excel.getData("WebAppsPage", 5, 0);
		Assert.assertTrue(wap.getUIText(EText), "UI Text not Found");
	}
}
