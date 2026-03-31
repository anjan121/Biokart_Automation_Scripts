package scripts.homepage_Header_scenarios.functional_scenarios;

import java.io.IOException;

import pom.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
import pom.HomePage;

public class AS_ClickOnHeader_ContactButton_HomePage extends OpenClose
{
	@Test
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
}
