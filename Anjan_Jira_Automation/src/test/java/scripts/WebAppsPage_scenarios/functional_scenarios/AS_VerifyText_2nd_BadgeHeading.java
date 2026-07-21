package scripts.WebAppsPage_scenarios.functional_scenarios;

import java.io.IOException;

//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.Excel;
import generic.OpenClose;
import pom.HomePage;
import pom.WebAppsPage;

public class AS_VerifyText_2nd_BadgeHeading extends OpenClose
{
	@Test
	public void test_VerifyText_2nd_BadgeHeading() throws IOException
	{
		SoftAssert SA=new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EBadgeHeading2=(String) Excel.getData("WebAppsPage", 30, 0);
		SA.assertTrue(wap.getBadgeHeadingText2(EBadgeHeading2), "Badge Heading2 text not found");
		
		String EBadgeHeadingSubHeading=(String) Excel.getData("WebAppsPage", 31, 0);
		SA.assertTrue(wap.getTextBelowBadgeHeadingText2(EBadgeHeadingSubHeading), "Sub Heading below Badge Heading 2 Text 1 not found");
		
		String EBadgeHeadingPara=(String) Excel.getData("WebAppsPage", 32, 0);
		SA.assertTrue(wap.getParaBelowBadgeHeadingText2(EBadgeHeadingPara), "Paragraph below Badge Heading 2 not found");
		SA.assertAll();
		
	}
}
