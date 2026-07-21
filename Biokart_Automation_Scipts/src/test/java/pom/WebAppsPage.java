package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.AllVerifications;

public class WebAppsPage extends AllVerifications {

	// ============================================================
	// ✅ INIT
	// ============================================================

	public WebAppsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// ============================================================
	// ✅ PAGE VERIFICATION
	// ============================================================
	@FindBy(css = "li.text-slate-800.truncate")
	private WebElement WebandMobileApps;
	
	@FindBy(css = "div>span.service-tag-pill:nth-of-type(1)")
	private WebElement WebApps;
	
	@FindBy(css = "div>span.service-tag-pill:nth-of-type(2)")
	private WebElement Mobile;
	
	@FindBy(css = "div>span.service-tag-pill:nth-of-type(3)")
	private WebElement UI;
	
	@FindBy(css = "div>span.service-tag-pill:nth-of-type(4)")
	private WebElement Responsive;
	
	@FindBy(css = "div>span.service-tag-pill:nth-of-type(5)")
	private WebElement React;
	
	@FindBy(css = "h1.service-hero-title")
	private WebElement WebandMobilePlatforms;
	
	@FindBy(css = "p.service-hero-text")
	private WebElement BelowWebandMobilePlatformsText;
	
	@FindBy(css = "div.service-hero-status")
	private WebElement BelowStatusWebandMobilePlatforms;
	
	@FindBy(css = "section>div>h2.service-main-heading")
	private WebElement MainHeading;
	
	@FindBy(css = "section>div>ul>li:nth-of-type(1)")
	private WebElement Text1BelowMainHeading;
	
	
	@FindBy(css = "section>div>ul>li:nth-of-type(2)")
	private WebElement Text2BelowMainHeading;
	
	@FindBy(css = "section>div>ul>li:nth-of-type(3)")
	private WebElement Text3BelowMainHeading;
	
	@FindBy(css = "section>div>ul>li:nth-of-type(4)")
	private WebElement Text4BelowMainHeading;
	
	
	@FindBy(css = "h3.service-badge-heading")
	private WebElement BadgeHeading;
	
	@FindBy(css = "p.service-paragraph:nth-of-type(1)")
	private WebElement ParaBelowBadgeHeading;
	
	@FindBy(css = "span.inline-flex:nth-of-type(1)")
	private WebElement Text1BelowBadgeHeading;
	
	@FindBy(css = "span.inline-flex:nth-of-type(2)")
	private WebElement Text2BelowBadgeHeading;
	
	@FindBy(css = "span.inline-flex:nth-of-type(3)")
	private WebElement Text3BelowBadgeHeading;
	
	
	@FindBy(css = "section>h2.service-main-heading")
	private WebElement MainHeading2;
	
	@FindBy(css = "div.service-grid-three>div:nth-of-type(1)>div>h4")
	private WebElement Text1BelowMainHeading2;
	
	@FindBy(css = "div.service-grid-three>div:nth-of-type(1)>div>p")
	private WebElement Para_belowText1OfH2;
	
	@FindBy(css = "div.service-grid-three>div:nth-of-type(2)>div>h4")
	private WebElement Text2BelowMainHeading2;
	
	@FindBy(css = "div.service-grid-three>div:nth-of-type(2)>div>p")
	private WebElement Para_belowText2OfH2;
	
	@FindBy(css = "div.service-grid-three>div:nth-of-type(3)>div>h4")
	private WebElement Text3BelowMainHeading2;
	
	@FindBy(css = "div.service-grid-three>div:nth-of-type(3)>div>p")
	private WebElement Para_belowText3OfH2;
	
	@FindBy(css = "p.service-badge-heading")
	private WebElement BadgeHeading2;
	
	@FindBy(css = "div>h2.mt-3")
	private WebElement TextBelowBadgeHeading2;
	
	@FindBy(css = "div>p.mt-4")
	private WebElement ParaBelowBadgeHeading2;
	
	@FindBy(css = "label.form-label")
	private WebElement Emailtext;
	
	@FindBy(css = "div>input")
	private WebElement subscriptionEmailTextField;

	@FindBy(css = "div>button.primary-gradient-button")
	private WebElement subscriptionButton;
	
	@FindBy(css = "footer.hp-font form>p.text-red-500.text-sm")
	private WebElement subscriptionErrorMessage;

	@FindBy(css = "div.mt-4>p.text-sm")
	private WebElement subscriptionSuccessMessage;
	
	@FindBy(css = "article:first-child>div.inline-flex")
	private WebElement LogoOfMU;
	
	@FindBy(css = "div>article:first-child>h3")
	private WebElement TextOfMU;
	
	@FindBy(css = "div>article:first-child>p")
	private WebElement ParaOfMU;
	
	@FindBy(css = "article:last-child>div.inline-flex")
	private WebElement LogoOfNS;
	
	@FindBy(css = "div>article:last-child>h3")
	private WebElement TextOfNS;
	
	@FindBy(css = "div>article:last-child>p")
	private WebElement ParaOfNS;
	
	@FindBy(css = "li>a.text-indigo-600")
	private WebElement EcodersButton;
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean getWebandMobileAppsText(String expectedText) {
		return verifyText(WebandMobileApps, expectedText, "Web & Mobile Apps Text", "equals", true);
	}
	
	public boolean getWebAppsText(String expectedText) {
		return verifyText(WebApps, expectedText, "Web-Apps Text", "equals", true);
	}
	
	public boolean getMobileText(String expectedText) {
		return verifyText(Mobile, expectedText, "Mobile Text", "equals", true);
	}
	
	public boolean getUIText(String expectedText) {
		return verifyText(UI, expectedText, "UI Text", "equals", true);
	}
	
	public boolean getResponsiveText(String expectedText) {
		return verifyText(Responsive, expectedText, "Responsive Text", "equals", true);
	}
	
	public boolean getReactText(String expectedText) {
		return verifyText(React, expectedText, "React Text", "equals", true);
	}
	
	public boolean getHeroHeadingText(String expectedText) {
		return verifyText(WebandMobilePlatforms, expectedText, "Hero Heading Text", "equals", true);
	}
	
	public boolean getBelowHeroHeadingText(String expectedText) {
		return verifyText(BelowWebandMobilePlatformsText, expectedText, "Hero Heading Below Text", "equals", true);
	}
	
	public boolean getBelowHeroHeadingStatusText(String expectedText) {
		return verifyText(BelowStatusWebandMobilePlatforms, expectedText, "Hero Heading Below Status Text", "equals", true);
	}
	
	
	public boolean getMainHeadingText(String expectedText) {
		return verifyText(MainHeading, expectedText, "Main Heading Text", "equals", true);
	}
	
	public boolean getBelowMainHeadingText1(String expectedText) {
		return verifyText(Text1BelowMainHeading, expectedText, "Main Heading below text-1 Text", "equals", true);
	}
	
	public boolean getBelowMainHeadingText2(String expectedText) {
		return verifyText(Text2BelowMainHeading, expectedText, "Main Heading below text-2 Text", "equals", true);
	}
	
	public boolean getBelowMainHeadingText3(String expectedText) {
		return verifyText(Text3BelowMainHeading, expectedText, "Main Heading below text-3 Text", "equals", true);
	}
	
	public boolean getBelowMainHeadingText4(String expectedText) {
		return verifyText(Text4BelowMainHeading, expectedText, "Main Heading below text-4 Text", "equals", true);
	}
	
	public boolean getBadgeHeadingText(String expectedText) {
		return verifyText(BadgeHeading, expectedText, "Badge Heading Text", "equals", true);
	}
	
	public boolean getBadgeHeadingParaBelowText(String expectedText) {
		return verifyText(ParaBelowBadgeHeading, expectedText, "Paragraph Below Badge Heading Text", "equals", true);
	}
	
	public boolean getBelowBadgeHeadingText1(String expectedText) {
		return verifyText(Text1BelowBadgeHeading, expectedText, "Badge Heading below text-1 Text", "equals", true);
	}
	
	public boolean getBelowBadgeHeadingText2(String expectedText) {
		return verifyText(Text2BelowBadgeHeading, expectedText, "Badge Heading below text-2 Text", "equals", true);
	}
	
	public boolean getBelowBadgeHeadingText3(String expectedText) {
		return verifyText(Text3BelowBadgeHeading, expectedText, "Badge Heading below text-3 Text", "equals", true);
	}
	
	public boolean getMainHeading2Text(String expectedText) {
		return verifyText(MainHeading2, expectedText, "Second Main Heading Text", "equals", true);
	}
	
	public boolean getText1BelowMainHeading2Text(String expectedText) {
		return verifyText(Text1BelowMainHeading2, expectedText, "Second Main Heading Below text-1 Text", "equals", true);
	}
	
	public boolean getParaBelowMainHeading2Text1(String expectedText) {
		return verifyText(Para_belowText1OfH2, expectedText, "Paragraph Below Main Heading Text of Text-1", "equals", true);
	}
	
	public boolean getText2BelowMainHeading2Text(String expectedText) {
		return verifyText(Text2BelowMainHeading2, expectedText, "Second Main Heading Below text-2 Text", "equals", true);
	}
	
	public boolean getParaBelowMainHeading2Text2(String expectedText) {
		return verifyText(Para_belowText2OfH2, expectedText, "Paragraph Below Main Heading Text of Text-2", "equals", true);
	}
	
	public boolean getText3BelowMainHeading2Text(String expectedText) {
		return verifyText(Text3BelowMainHeading2, expectedText, "Second Main Heading Below text-3 Text", "equals", true);
	}
	
	public boolean getParaBelowMainHeading2Text3(String expectedText) {
		return verifyText(Para_belowText3OfH2, expectedText, "Paragraph Below Main Heading Text of Text-3", "equals", true);
	}
	
	public boolean getBadgeHeadingText2(String expectedText) {
		return verifyText(BadgeHeading2, expectedText, "Second Badge Heading Text", "equals", true);
	}
	
	public boolean getTextBelowBadgeHeadingText2(String expectedText) {
		return verifyText(TextBelowBadgeHeading2, expectedText, "Text Below Second Badge Heading Text", "equals", true);
	}
	
	public boolean getParaBelowBadgeHeadingText2(String expectedText) {
		return verifyText(ParaBelowBadgeHeading2, expectedText, "Paragraph Below Second Badge Heading Text", "equals", true);
	}
	
	public boolean getEmailText(String expectedText) {
		return verifyText(Emailtext,expectedText,"Email Text","equals",true);
	}
	
	public boolean verifySubscribeFormHeading(String expectedText) {
		return verifyText(Emailtext, expectedText, "Email address", "equals", true);
	}
	
	public boolean verifySubscriptionEmailTextFieldIsDisplayed() {
		return verifyElementPresentAndVisible(subscriptionEmailTextField, "Subscription Email Text Field");
	}

	public boolean verifySubscriptionEmailInputFieldIsCleared() {
		return verifyInputFieldValue(subscriptionEmailTextField, "", "Subscription Email Text Field");
	}

	public boolean enterValueIntoSubscritionFormInputField(String valueToEnter) {
		return clearAndEnterValueIntoInputField(subscriptionEmailTextField, valueToEnter,
				"Subscritpion form email input field.");
	}

	public boolean verifySubscriptionButtonIsDisplayed() {
		return verifyElementPresentAndVisible(subscriptionButton, "Subscription Button");
	}

	public boolean clickOnSubscriptionButton() {
		return clickOnElement(subscriptionButton, "Subscription Button");
	}

	public boolean verifySubscriptionErrorMessageIsDisplayed() {
		return verifyElementPresentAndVisible(subscriptionErrorMessage, "Subscription Error Message");
	}

	public boolean verifySubscriptionSuccessMessageIsDisplayed() {
		return verifyElementPresentAndVisible(subscriptionSuccessMessage, "Subscription Success Message");
	}

	public boolean verifySubscriptionErrorMessageText(String expectedText) {
		return verifyText(subscriptionErrorMessage, expectedText, "Subscription Error Message", "equals", true);
	}

	public boolean verifySubscriptionSuccessMessageText(String expectedText) {
		return verifyText(subscriptionSuccessMessage, expectedText, "Subscription Success Message", "contains", true);
	}
	
	public boolean getMUText(String expectedText) {
		return verifyText(TextOfMU,expectedText,"Mobile Updates Text","equals",true);
	}
	public boolean getParaofMUText(String expectedText) {
		return verifyText(ParaOfMU,expectedText,"Mobile Updates Paragrah Text","equals",true);
	}
	public boolean getNSText(String expectedText) {
		return verifyText(TextOfNS,expectedText,"No Spams Text","equals",true);
	}
	public boolean getParaofNSText(String expectedText) {
		return verifyText(ParaOfNS,expectedText,"Paragraph of No Spams Text","equals",true);
	}
	
	public void verifyWebAppsPageTitle(String expectedTitle) {
		verifyTitleOfWebpage(expectedTitle);
	}

	public void verifyWebAppsPageUrl(String expectedUrl) {
		verifyUrlOfWebpage(expectedUrl);
	}
}
