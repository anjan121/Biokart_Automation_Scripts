package scripts.WebAppsPage_scenarios.functional_scenarios;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
import pom.HomePage;
import pom.WebAppsPage;

public class AS_VerifyText_1st_MainHeading extends OpenClose
{
	@Test
	public void test_VerifyText_1st_MainHeading() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		Assert.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EMainHeading=(String) Excel.getData("WebAppsPage", 11, 0);
		Assert.assertTrue(wap.getMainHeadingText(EMainHeading), "Main Heading text not found");
		
		String EMainHeadingText1=(String) Excel.getData("WebAppsPage", 12, 0);
		Assert.assertTrue(wap.getBelowMainHeadingText1(EMainHeadingText1), "Text 1 not found");
		
		String EMainHeadingText2=(String) Excel.getData("WebAppsPage", 13, 0);
		Assert.assertTrue(wap.getBelowMainHeadingText2(EMainHeadingText2), "Text 2 not found");
		
		String EMainHeadingText3=(String) Excel.getData("WebAppsPage", 14, 0);
		Assert.assertTrue(wap.getBelowMainHeadingText3(EMainHeadingText3), "Text 3 not found");
		
		String EMainHeadingText4=(String) Excel.getData("WebAppsPage", 15, 0);
		Assert.assertTrue(wap.getBelowMainHeadingText4(EMainHeadingText4), "Text 4 not found");
	}
}
