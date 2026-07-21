package scripts.WebAppsPage_scenarios.functional_scenarios;

import java.io.IOException;

//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.Excel;
import generic.OpenClose;
import pom.HomePage;
import pom.WebAppsPage;

public class AS_WebAppsPages_Regression_Scenarios extends OpenClose
{
	@Test(priority=1)
	public void test_NavigateToWebAppsPageFromHomePage() throws IOException
	{
		SoftAssert SA= new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		
		WebAppsPage wap = new WebAppsPage(driver);
		
		String ETitle1=(String) Excel.getData("WebAppsPage", 1, 0);
		String EUrl=(String) Excel.getData("WebAppsPage", 1, 1);
		
		SA.assertTrue(wap.verifyTitleOfWebpage(ETitle1),"Expected Title not Verified");
		SA.assertTrue(wap.verifyUrlOfWebpage(EUrl),"Expected Url not Verified");
		SA.assertAll();
	}
	
	@Test(priority=2)
	public void test_VerifyText_WebAndMobileApps() throws IOException
	{
		SoftAssert SA= new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EText=(String) Excel.getData("WebAppsPage", 2, 0);
		SA.assertTrue(wap.getWebandMobileAppsText(EText), "Web & Mobile Apps Text not found ");
		SA.assertAll();
	}
	
	@Test(priority=3)
	public void test_clickonEcoders() throws IOException
	{
		SoftAssert SA= new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		
		WebAppsPage wap = new WebAppsPage(driver);
		
		SA.assertTrue(wap.ClickOnEcoders(),"Not able to click on Ecoders");
		SA.assertAll();
	}
	

	@Test(priority=4)
	public void test_VerifyText_WebApps() throws IOException
	{
		SoftAssert SA= new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EText=(String) Excel.getData("WebAppsPage", 3, 0);
		SA.assertTrue(wap.getWebAppsText(EText), "Web Apps not Found");
		SA.assertAll();
	}
	
	@Test(priority=5)
	public void test_VerifyText_Mobile() throws IOException
	{
		SoftAssert SA= new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EText=(String) Excel.getData("WebAppsPage", 4, 0);
		SA.assertTrue(wap.getMobileText(EText), "Mobile Text not Found");
		SA.assertAll();
	}
	
	@Test(priority=6)
	public void test_VerifyText_UI() throws IOException
	{
		SoftAssert SA= new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EText=(String) Excel.getData("WebAppsPage", 5, 0);
		SA.assertTrue(wap.getUIText(EText), "UI Text not Found");
		SA.assertAll();
	}
	
	@Test(priority=7)
	public void test_VerifyText_Responsive() throws IOException
	{
		SoftAssert SA= new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EText=(String) Excel.getData("WebAppsPage", 6, 0);
		SA.assertTrue(wap.getResponsiveText(EText), "Responsive Text not Found");
		SA.assertAll();
	}
	
	@Test(priority=8)
	public void test_VerifyText_React() throws IOException
	{
		SoftAssert SA= new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EText=(String) Excel.getData("WebAppsPage", 7, 0);
		SA.assertTrue(wap.getReactText(EText), "React Text not Found");
		SA.assertAll();
	}
	
	@Test(priority=9)
	public void test_VerifyText_HeroSection() throws IOException
	{
		SoftAssert SA= new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EHeading=(String) Excel.getData("WebAppsPage", 8, 0);
		SA.assertTrue(wap.getHeroHeadingText(EHeading), "Web & mobile platforms text not found");
		
		String EHeadingPara=(String) Excel.getData("WebAppsPage", 9, 0);
		SA.assertTrue(wap.getBelowHeroHeadingText(EHeadingPara), "Paragraph not found");
		
		String EHeadingTextStatus=(String) Excel.getData("WebAppsPage", 10, 0);
		SA.assertTrue(wap.getBelowHeroHeadingStatusText(EHeadingTextStatus), "Status text not found");
		SA.assertAll();
	}
	
	@Test(priority=10)
	public void test_VerifyText_1st_MainHeading() throws IOException
	{
		SoftAssert SA= new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EMainHeading=(String) Excel.getData("WebAppsPage", 11, 0);
		SA.assertTrue(wap.getMainHeadingText(EMainHeading), "Main Heading text not found");
		
		String EMainHeadingText1=(String) Excel.getData("WebAppsPage", 12, 0);
		SA.assertTrue(wap.getBelowMainHeadingText1(EMainHeadingText1), "Text 1 not found");
		
		String EMainHeadingText2=(String) Excel.getData("WebAppsPage", 13, 0);
		SA.assertTrue(wap.getBelowMainHeadingText2(EMainHeadingText2), "Text 2 not found");
		
		String EMainHeadingText3=(String) Excel.getData("WebAppsPage", 14, 0);
		SA.assertTrue(wap.getBelowMainHeadingText3(EMainHeadingText3), "Text 3 not found");
		
		String EMainHeadingText4=(String) Excel.getData("WebAppsPage", 15, 0);
		SA.assertTrue(wap.getBelowMainHeadingText4(EMainHeadingText4), "Text 4 not found");
		SA.assertAll();
	}
	
	@Test(priority=11)
	public void test_VerifyText_1st_BadgeHeading() throws IOException
	{
		SoftAssert SA= new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EBadgeHeading=(String) Excel.getData("WebAppsPage", 16, 0);
		SA.assertTrue(wap.getBadgeHeadingText(EBadgeHeading), "Badge Heading text not found");
		
		String EBadgeHeadingPara=(String) Excel.getData("WebAppsPage", 17, 0);
		SA.assertTrue(wap.getBadgeHeadingParaBelowText(EBadgeHeadingPara), "Paragraph below Badge Heading Text 1 not found");
		
		String EBadgeHeadingText1=(String) Excel.getData("WebAppsPage", 18, 0);
		SA.assertTrue(wap.getBelowBadgeHeadingText1(EBadgeHeadingText1), "Text 1 below Badge Heading not found");
		
		String EBadgeHeadingText2=(String) Excel.getData("WebAppsPage", 19, 0);
		SA.assertTrue(wap.getBelowBadgeHeadingText2(EBadgeHeadingText2), "Text 2 below Badge Heading not found");
		
		String EBadgeHeadingText3=(String) Excel.getData("WebAppsPage", 20, 0);
		SA.assertTrue(wap.getBelowBadgeHeadingText3(EBadgeHeadingText3), "Text 3 below Badge Heading not found");
		SA.assertAll();
	}
	
	@Test(priority=12)
	public void test_VerifyText_2nd_MainHeading() throws IOException
	{
		SoftAssert SA= new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String E2ndMainHeading=(String) Excel.getData("WebAppsPage", 22, 0);
		SA.assertTrue(wap.getMainHeading2Text(E2ndMainHeading), "2nd Main Heading text not found");
		
		String ESubHeadingText1=(String) Excel.getData("WebAppsPage", 23, 0);
		SA.assertTrue(wap.getText1BelowMainHeading2Text(ESubHeadingText1), "Sub Heading Under 2nd Main Heading not found");
		
		String EParaHeadingText1=(String) Excel.getData("WebAppsPage", 24, 0);
		SA.assertTrue(wap.getParaBelowMainHeading2Text1(EParaHeadingText1), "Paragraph below sub Heading 1 not found");
		
		String ESubHeadingText2=(String) Excel.getData("WebAppsPage", 25, 0);
		SA.assertTrue(wap.getText2BelowMainHeading2Text(ESubHeadingText2), "Sub Heading 2 Under 2nd Main Heading not found");
		
		String EParaHeadingText2=(String) Excel.getData("WebAppsPage", 26, 0);
		SA.assertTrue(wap.getParaBelowMainHeading2Text2(EParaHeadingText2), "Paragraph below sub Heading 2 not found");
		
		String ESubHeadingText3=(String) Excel.getData("WebAppsPage", 27, 0);
		SA.assertTrue(wap.getText3BelowMainHeading2Text(ESubHeadingText3), "Sub Heading 2 Under 2nd Main Heading not found");
		
		String EParaHeadingText3=(String) Excel.getData("WebAppsPage", 28, 0);
		SA.assertTrue(wap.getParaBelowMainHeading2Text3(EParaHeadingText3), "Paragraph below sub Heading 3 not found");
		SA.assertAll();
		
	}
	
	@Test(priority=13)
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
	
	
	
	
	
	
	
	
	
	@Test
	public void test_VerifyText1AtBelowWebAppPage() throws IOException
	{
		SoftAssert SA=new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EText1=(String) Excel.getData("WebAppsPage", 39, 0);
		SA.assertTrue(wap.getMUText(EText1), "Monthly Updates text not found");
		
		String EBelowParaOfText1=(String) Excel.getData("WebAppsPage", 40, 0);
		SA.assertTrue(wap.getParaofMUText(EBelowParaOfText1), "Below Paragraph of Monthly Updates Text  not found");
		SA.assertAll();
	}
	
	@Test
	public void test_VerifyText2AtBelowWebAppPage() throws IOException
	{
		SoftAssert SA=new SoftAssert();
		HomePage hp = new HomePage(driver);
		String ETitle = (String) Excel.getData("HomePage", 1, 0);
		SA.assertTrue(hp.verifyTitleOfWebpage(ETitle),"Expected title not Verified");
		driver.navigate().to(URL_WEB_APPS1);
		WebAppsPage wap = new WebAppsPage(driver);
		
		String EText2=(String) Excel.getData("WebAppsPage", 43, 0);
		SA.assertTrue(wap.getNSText(EText2), "No Spams text not found");
		
		String EBelowParaOfText2=(String) Excel.getData("WebAppsPage", 44, 0);
		SA.assertTrue(wap.getParaofNSText(EBelowParaOfText2), "Below Paragraph of No Spams Text  not found");
		SA.assertAll();
	}
	
}
