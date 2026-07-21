package scripts.WebAppsPage_scenarios.functional_scenarios;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
import pom.HomePage;
import pom.WebAppsPage;

public class AS_VerifyText_HeroSection extends OpenClose
{
	@Test
	public void test_VerifyText_HeroSection() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		Assert.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EHeading=(String) Excel.getData("WebAppsPage", 8, 0);
		Assert.assertTrue(wap.getHeroHeadingText(EHeading), "Web & mobile platforms text not found");
		
		String EHeadingPara=(String) Excel.getData("WebAppsPage", 9, 0);
		Assert.assertTrue(wap.getBelowHeroHeadingText(EHeadingPara), "Paragraph not found");
		
		String EHeadingTextStatus=(String) Excel.getData("WebAppsPage", 10, 0);
		Assert.assertTrue(wap.getBelowHeroHeadingStatusText(EHeadingTextStatus), "Status text not found");
	}
}
