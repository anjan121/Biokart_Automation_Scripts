package scripts.WebAppsPage_scenarios.functional_scenarios;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
import pom.HomePage;
import pom.WebAppsPage;

public class AS_VerifyText_1st_BadgeHeading extends OpenClose
{
	@Test
	public void test_VerifyText_1st_BadgeHeading() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		Assert.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EBadgeHeading=(String) Excel.getData("WebAppsPage", 16, 0);
		Assert.assertTrue(wap.getBadgeHeadingText(EBadgeHeading), "Badge Heading text not found");
		
		String EBadgeHeadingPara=(String) Excel.getData("WebAppsPage", 17, 0);
		Assert.assertTrue(wap.getBadgeHeadingParaBelowText(EBadgeHeadingPara), "Paragraph below Badge Heading Text 1 not found");
		
		String EBadgeHeadingText1=(String) Excel.getData("WebAppsPage", 18, 0);
		Assert.assertTrue(wap.getBelowBadgeHeadingText1(EBadgeHeadingText1), "Text 1 below Badge Heading not found");
		
		String EBadgeHeadingText2=(String) Excel.getData("WebAppsPage", 19, 0);
		Assert.assertTrue(wap.getBelowBadgeHeadingText2(EBadgeHeadingText2), "Text 2 below Badge Heading not found");
		
		String EBadgeHeadingText3=(String) Excel.getData("WebAppsPage", 20, 0);
		Assert.assertTrue(wap.getBelowBadgeHeadingText3(EBadgeHeadingText3), "Text 3 below Badge Heading not found");
	}
}
