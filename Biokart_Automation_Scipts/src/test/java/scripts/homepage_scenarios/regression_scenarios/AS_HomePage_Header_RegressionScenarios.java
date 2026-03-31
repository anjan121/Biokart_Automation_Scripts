package scripts.homepage_scenarios.regression_scenarios;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
import pom.Header;
import pom.HomePage;

public class AS_HomePage_Header_RegressionScenarios extends OpenClose
{
	@Test(priority=1)
	public void testClickOnLogo_HomePage() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String expectedurl=(String) Excel.getData("HomePage", 0, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(expectedurl), "Url Miss matched");
		Header h1 = new Header(driver);
		Assert.assertTrue(h1.clickHeaderLogoHome(),"Unable to click on Logo");
	}
	
	@Test(priority=2)
	public void testClickOnLogoText_HomePage() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String expectedurl=(String) Excel.getData("HomePage", 0, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(expectedurl), "Url Miss matched");
		Header h1 = new Header(driver);
		Assert.assertEquals(h1.clickHeaderLogoAppNameAndPrintText(),"Biokart India Pvt Ltd");
	}
	
	@Test(priority=3)
	public void testVerifytextBelowLogoText_HomePage() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String expectedurl=(String) Excel.getData("HomePage", 0, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(expectedurl), "Url Miss matched");
		Header h1 = new Header(driver);
		Assert.assertEquals(h1.verifyTextBelowHomeLogoText(),"Bringing Biotech Closer!");
	}
	
	@Test(priority=4)
	public void testClickOnHeader_HomeButton_HomePage() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String expectedurl=(String) Excel.getData("HomePage", 0, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(expectedurl), "Url Miss matched");
		Header h1 = new Header(driver);
		Assert.assertTrue(h1.clickHeaderHome(),"Not Able to click About text");
		String ExpectedHomeurl=(String) Excel.getData("HomePage", 0, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(ExpectedHomeurl), "Url Miss matched");
	}
	
	@Test(priority=5)
	public void testClickOnHeader_AboutButton_HomePage() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String expectedurl=(String) Excel.getData("HomePage", 0, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(expectedurl), "Url Miss matched");
		Header h1 = new Header(driver);
		Assert.assertTrue(h1.clickHeaderAbout(),"Not Able to click About text");
		String ExpectedAbouturl=(String) Excel.getData("HomePage", 1, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(ExpectedAbouturl), "Url Miss matched");
	}
	
	@Test(priority=6)
	public void testClickOnHeader_ServicesButton_HomePage() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String expectedurl=(String) Excel.getData("HomePage", 0, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(expectedurl), "Url Miss matched");
		Header h1 = new Header(driver);
		Assert.assertTrue(h1.clickHeaderService(),"Not Able to click About text");
		String ExpectedServiceurl=(String) Excel.getData("HomePage", 2, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(ExpectedServiceurl), "Url Miss matched");
	}
	
	@Test(priority=7)
	public void testClickOnHeader_ContactButton_HomePage() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String expectedurl=(String) Excel.getData("HomePage", 0, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(expectedurl), "Url Miss matched");
		Header h1 = new Header(driver);
		Assert.assertTrue(h1.clickHeaderContact(),"Not Able to click About text");
		String ExpectedContacturl=(String) Excel.getData("HomePage", 3, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(ExpectedContacturl), "Url Miss matched");
	}
	
	@Test(priority=8)
	public void testClickOnHeader_TermsandConditionsButton_HomePage() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String expectedurl=(String) Excel.getData("HomePage", 0, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(expectedurl), "Url Miss matched");
		Header h1 = new Header(driver);
		Assert.assertTrue(h1.clickHeaderTermsandConditions(),"Not Able to click About text");
		String ExpectedTCurl=(String) Excel.getData("HomePage", 4, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(ExpectedTCurl), "Url Miss matched");
	}
	
	@Test(priority=9)
	public void testClickOnHeader_Privacy_PolicyButton_HomePage() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String expectedurl=(String) Excel.getData("HomePage", 0, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(expectedurl), "Url Miss matched");
		Header h1 = new Header(driver);
		Assert.assertTrue(h1.clickHeaderPrivacyPolicy(),"Not Able to click About text");
		String ExpectedPPurl=(String) Excel.getData("HomePage", 5, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(ExpectedPPurl), "Url Miss matched");
	}
}
