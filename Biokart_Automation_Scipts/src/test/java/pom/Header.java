package pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.AllVerifications;

public class Header extends AllVerifications {

	// ============================================================
	// ✅ HEADER - LEFT (Logo + Shop All)
	// ============================================================

	public Header(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div>span.site-logo-img")
	private WebElement headerHomeLogoLink;

	@FindBy(css = "div>h1.site-title")
	private WebElement headerHomeLogoAppNameText;

	@FindBy(css = "p.site-description")
	private WebElement headerAppNameBelowText;

	

	@FindBy(css = "a.menu-link[aria-current=\"page\"][href=\"https://biokart.com/\"]")
	private WebElement headerHome;

	@FindBy(css = "a.menu-link[href=\"https://biokart.com/services-2/\"]")
	private WebElement headerServices;

	@FindBy(css = "a.menu-link[href=\"https://biokart.com/contact/\"]")
	private WebElement headerContact;

	@FindBy(css = "a.menu-link[href=\"https://biokart.com/about/\"]")
	private WebElement headerAbout;

	@FindBy(css = "a.menu-link[href=\"https://biokart.com/terms-and-conditions/\"]")
	private WebElement headerTermsAndConditions;
	
	@FindBy(css = "a.menu-link[href=\"https://biokart.com/privacy-policy/\"]")
	private WebElement headerPrivacyPolicy;

	

	////////////////////////////////////////////////////////////////////////////////////
	public boolean clickHeaderLogoHome() {
		return clickOnElement(headerHomeLogoLink, "Header Home Logo");
	}

	public String clickHeaderLogoAppNameAndPrintText() {
		clickOnElement(headerHomeLogoAppNameText, "Header App Name Text");
		return getTextFromElement(headerHomeLogoAppNameText, "Header App Name Text");
	}
	
	
	public String verifyTextBelowHomeLogoText()
	{
		return getTextFromElement(headerAppNameBelowText, "Header App Name Below Text");
	}
	
	
	public boolean clickHeaderHome() {
		return clickOnElement(headerHome, "Header Home Page");
	}
	
	public boolean clickHeaderService() {
		return clickOnElement(headerServices, "Header Services Page");
	}
	
	public boolean clickHeaderContact() {
		return clickOnElement(headerContact, "Header Contact Page");
	}
	
	public boolean clickHeaderAbout() {
		return clickOnElement(headerAbout, "Header About Page");
	}
	
	public boolean clickHeaderTermsandConditions() {
		return clickOnElement(headerTermsAndConditions, "Header Terms and Condidtions Page");
	}
	
	public boolean clickHeaderPrivacyPolicy() {
		return clickOnElement(headerPrivacyPolicy, "Header Privacy Policy Page");
	}

	// ---------- Search (Desktop / Mobile Row) ----------

	

	

	

	

	

	

	

	
}