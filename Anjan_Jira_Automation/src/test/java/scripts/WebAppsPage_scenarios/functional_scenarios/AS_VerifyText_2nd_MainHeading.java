package scripts.WebAppsPage_scenarios.functional_scenarios;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
import pom.HomePage;
import pom.WebAppsPage;

public class AS_VerifyText_2nd_MainHeading extends OpenClose
{
	@Test
	public void test_VerifyText_2nd_MainHeading() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		Assert.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String E2ndMainHeading=(String) Excel.getData("WebAppsPage", 22, 0);
		Assert.assertTrue(wap.getMainHeading2Text(E2ndMainHeading), "2nd Main Heading text not found");
		
		String ESubHeadingText1=(String) Excel.getData("WebAppsPage", 23, 0);
		Assert.assertTrue(wap.getText1BelowMainHeading2Text(ESubHeadingText1), "Sub Heading Under 2nd Main Heading not found");
		
		String EParaHeadingText1=(String) Excel.getData("WebAppsPage", 24, 0);
		Assert.assertTrue(wap.getParaBelowMainHeading2Text1(EParaHeadingText1), "Paragraph below sub Heading 1 not found");
		
		String ESubHeadingText2=(String) Excel.getData("WebAppsPage", 25, 0);
		Assert.assertTrue(wap.getText2BelowMainHeading2Text(ESubHeadingText2), "Sub Heading 2 Under 2nd Main Heading not found");
		
		String EParaHeadingText2=(String) Excel.getData("WebAppsPage", 26, 0);
		Assert.assertTrue(wap.getParaBelowMainHeading2Text2(EParaHeadingText2), "Paragraph below sub Heading 2 not found");
		
		String ESubHeadingText3=(String) Excel.getData("WebAppsPage", 27, 0);
		Assert.assertTrue(wap.getText3BelowMainHeading2Text(ESubHeadingText3), "Sub Heading 2 Under 2nd Main Heading not found");
		
		String EParaHeadingText3=(String) Excel.getData("WebAppsPage", 28, 0);
		Assert.assertTrue(wap.getParaBelowMainHeading2Text3(EParaHeadingText3), "Paragraph below sub Heading 3 not found");
		
		
	}
}
