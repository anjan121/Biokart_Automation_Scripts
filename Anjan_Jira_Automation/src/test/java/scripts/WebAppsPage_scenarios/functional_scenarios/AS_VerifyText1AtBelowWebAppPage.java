package scripts.WebAppsPage_scenarios.functional_scenarios;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.Excel;
import generic.OpenClose;
import pom.HomePage;
import pom.WebAppsPage;

public class AS_VerifyText1AtBelowWebAppPage extends OpenClose
{
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
}
