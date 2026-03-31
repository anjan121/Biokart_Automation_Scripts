package scripts.homepage_Header_scenarios.functional_scenarios;

import java.io.IOException;

import pom.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Excel;
import generic.OpenClose;
import pom.HomePage;

public class AS_ClickOnLogoText_HomePage extends OpenClose
{
	@Test
	public void testClickOnLogoText_HomePage() throws IOException
	{
		HomePage hp = new HomePage(driver);
		String expectedurl=(String) Excel.getData("HomePage", 0, 0);
		Assert.assertTrue(hp.verifyUrlOfWebpage(expectedurl), "Url Miss matched");
		Header h1 = new Header(driver);
		Assert.assertEquals(h1.clickHeaderLogoAppNameAndPrintText(),"Biokart India Pvt Ltd");
	}
}
