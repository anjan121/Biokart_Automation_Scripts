package scripts.WebAppsPage_scenarios.functional_scenarios;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.Excel;
import generic.OpenClose;
import pom.HomePage;
import pom.WebAppsPage;

public class AS_VerifyText2AtBelowWebAppPage extends OpenClose
{
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
