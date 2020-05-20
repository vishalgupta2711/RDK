package com.RDK.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RDK.qa.base.TestBaseRDK;

public class HomePageRDK extends TestBaseRDK{

	//PageFactory - OR for Home Page
	
	@FindBy(css = "img.brand-image.elevation-3")
	WebElement RDKLogo;
	
	@FindBy(css = ".toolbar-link>i.fa.fa-envelope")
	WebElement MailLink;
	
	@FindBy(css = ".toolbar-link>.fa.fa-facebook")
	WebElement FBTopLink;
	
	@FindBy(css = ".toolbar-link>.fa.fa-twitter")
	WebElement TwitterTopLink;
	
	@FindBy(css = ".toolbar-link>.fa.fa-google-plus")
	WebElement GoogleTopLink;
	
	@FindBy(css = ".toolbar-link>.fa.fa-linkedin")
	WebElement LinkedInTopLink;
	
	@FindBy(css = ".navbar-nav>li:first-of-type")
	WebElement HomeBtn;
	
	@FindBy(css = ".navbar-nav>li:nth-of-type(2)")
	WebElement SearchBtn;
	
	@FindBy(css = ".navbar-nav>li:nth-of-type(3)")
	WebElement SearchByIdBtn;
	
	@FindBy(css = ".navbar-nav>li:nth-of-type(4)")
	WebElement HelpBtn;
	
	@FindBy(css = ".navbar-nav>li:nth-of-type(5)")
	WebElement ContactBtn;
	
	@FindBy(css = ".navbar-nav>li:nth-of-type(6)")
	WebElement LoginBtn;
	
	@FindBy(css = ".navbar-nav>li:last-of-type")
	WebElement RegisterBtn;
	
	@FindBy(css = ".btn.btn-red.w-100>b")
	WebElement RegisterFreeBtn;
	
	public HomePageRDK() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyRDKLogo() {
		return RDKLogo.isDisplayed();
	}
	
	public boolean verifyMailLink() {
		return MailLink.isDisplayed();
	}
	
	public boolean verifyFBTopLink() {
		return FBTopLink.isDisplayed();
	}
	
	public boolean verifyTwitterTopLink() {
		return TwitterTopLink.isDisplayed();
	}
	
	public boolean verifyGoogleTopLink() {
		return GoogleTopLink.isDisplayed();
	}
	
	public boolean verifyLinkedInTopLink() {
		return LinkedInTopLink.isDisplayed();
	}
	
	public HomePageRDK clickOnHomePageLink() {
		HomeBtn.click();
		return new HomePageRDK();
	}
	
	public SearchPageRDK clickOnSearchPageLink() {
		SearchBtn.click();
		return new SearchPageRDK();
	}
	
	public SearchPageByIdRDK clickOnSearchPageByIdLink() {
		SearchByIdBtn.click();
		return new SearchPageByIdRDK();
	}
	
	public HelpPageRDK clickOnHelpPageLink() {
		HelpBtn.click();
		return new HelpPageRDK();
	}
	
	public ContactPageRDK clickOnContactPageLink() {
		ContactBtn.click();
		return new ContactPageRDK();
	}
	
	public LoginPageRDK clickOnLoginBtn() {
		LoginBtn.click();
		return new LoginPageRDK();
	}
	
	public RegistrationPageRDK clickOnRegisterBtn() {
		RegisterBtn.click();
		//RegisterFreeBtn.click();
		return new RegistrationPageRDK();
	}
}
