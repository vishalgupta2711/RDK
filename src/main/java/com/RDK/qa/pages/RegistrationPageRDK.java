package com.RDK.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.RDK.qa.base.TestBaseRDK;

public class RegistrationPageRDK extends TestBaseRDK {

	// PageFactory - OR for Registration Page

	@FindBy(css = "#select2-step-0-1-container")
	WebElement IMLookingForDD;

	@FindBy(css = ".select2-search__field")
	WebElement IMLookingForDDSrch;

	@FindBy(css = "#select2-step-0-2-container")
	WebElement GenderDD;

	@FindBy(css = ".select2-search__field")
	WebElement GenderDDSrch;

	@FindBy(css = "li[id$='Male']")
	WebElement GenderMale;

	@FindBy(css = "li[id$='Female']")
	WebElement GenderFemale;

	@FindBy(xpath = "//input[@placeholder = 'Enter Name']")
	WebElement NameText;

	@FindBy(xpath = "//input[@placeholder = 'Enter Mobile Number']")
	WebElement MobileNo;

	@FindBy(css = ".btn.btn-red.w-100>b")
	static WebElement ContinueBtn;

	@FindBy(xpath = "(//input[@type = 'date'])[1]")
	WebElement DOBirth;

	@FindBy(xpath = "//input[@placeholder = 'Enter Mobile Number']")
	WebElement AltMobNum;

	@FindBy(xpath = "//input[@placeholder = 'Enter Email']")
	WebElement EmailText;

	@FindBy(xpath = "//input[@type= 'Password']")
	WebElement PasswordText;

	@FindBy(css = "#select2-religion-container")
	WebElement ReligionDD;

	@FindBy(css = ".select2-search__field")
	WebElement ReligionDDSrch;

	@FindBy(css = "#select2-caste-container")
	WebElement CasteDD;

	@FindBy(css = "input[aria-activedescendant$='Hindu']")
	WebElement CasteDDSrch;

	@FindBy(xpath = "//input[@name = 'castNoBar']")
	WebElement CasteNoBar;

	@FindBy(css = "#select2-motherTongue-container")
	WebElement MotherTongueDD;

	@FindBy(css = ".select2-search__field")
	WebElement MotherTongueDDSrch;

	@FindBy(xpath = "//input[@name = 'subcaste']")
	WebElement SubCaste;

	@FindBy(xpath = "//input[@name = 'gothram']")
	WebElement Gothram;

	@FindBy(css = "#dosh-non")
	WebElement NonManglikBtn;

	@FindBy(css = "#dosh-manglik")
	WebElement ManglikBtn;

	@FindBy(css = "#dosh-pmanglik")
	WebElement PartialManglikBtn;

	// -----------------------------

	@FindBy(css = ".btn-pill1.mypill.mybtn1")
	WebElement NeverMarriedBtn;

	@FindBy(css = "span[id*='select2-height-']")
	WebElement HeightDD;

	@FindBy(css = ".select2-search__field")
	WebElement HeightDDSrch;

	@FindBy(css = ".btn-pill1.mybtn41.mypill3")
	WebElement FamilyStatusBtn;

	@FindBy(css = ".btn-pill.mybtn51.mypill4")
	WebElement FamilyTypeBtn;

	@FindBy(css = ".btn-pill1.mybtn64.mypill5")
	WebElement FamilyValuesBtn;

	@FindBy(css = "#nod")
	WebElement AnyDisabilityBtn;

	@FindBy(css = "span[id*='select2-education']")
	WebElement HighestQualification;

	@FindBy(css = ".select2-search__field")
	WebElement HighestQualificationSrch;

	@FindBy(css = ".btn-pill1.mypille.mybtn82")
	WebElement EmployedInBtn;

	@FindBy(css = "span[id*='select2-occupation']")
	WebElement OccupationDD;

	@FindBy(css = ".select2-search__field")
	WebElement OccupationDDSrch;

	@FindBy(css = "span[id*='select2-income']")
	WebElement AnnualIncomeDD;

	@FindBy(css = ".select2-search__field")
	WebElement AnnualIncomeDDSrch;

	@FindBy(xpath = "//input[@placeholder = 'Enter Amount']")
	WebElement AnnualIncomeAmount;

	@FindBy(css = "#select2-country-container")
	WebElement CountryDD;

	@FindBy(css = ".select2-search__field")
	WebElement CountryDDSrch;

	@FindBy(css = "#select2-state-container")
	WebElement StateDD;

	@FindBy(css = ".select2-search__field")
	WebElement StateDDSrch;

	@FindBy(css = "#select2-city-container")
	WebElement CityDD;

	@FindBy(css = ".select2-search__field")
	WebElement CityDDSrch;

	@FindBy(xpath = "//textarea[@placeholder = 'Something about you......']")
	WebElement AboutYouText;

	public RegistrationPageRDK() {
		PageFactory.initElements(driver, this);
	}

	public void registerUser(String IMLookingFor, String Gender, String Name, String Mobile, String DOB_ddmm,
			String DOB_yyyy, String AltMobNo, String Email, String Password, String Religion, String MotherTongue,
			String Dosh, String MaritalStatus, String Height, String FamilyStatus, String FamilyType,
			String FamilyValues, String AnyDisability, String HighestEducation, String EmployedIn, String Occupation,
			String AnnualIncomeCurrency, String AnnualIncomeAmt, String Country, String State, String City,
			String AboutYou) throws InterruptedException {

		// *****************Entering the text for I m looking for***********************
		IMLookingForDD.click();
		IMLookingForDDSrch.sendKeys(IMLookingFor);

		List<WebElement> list = driver.findElements(By.cssSelector("#select2-step-0-1-results>li"));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).getText());

			if (list.get(i).getText().equals("Myself")) {
				list.get(i).click();
			} else if (list.get(i).getText().equals("Son")) {
				list.get(i).click();
			} else if (list.get(i).getText().equals("Daughter")) {
				list.get(i).click();
			} else if (list.get(i).getText().equals("Brother")) {
				list.get(i).click();
			} else if (list.get(i).getText().equals("Sister")) {
				list.get(i).click();
			} else if (list.get(i).getText().equals("Relative")) {
				list.get(i).click();
			} else if (list.get(i).getText().equals("Friend")) {
				list.get(i).click();
			}

		}

		// ******************selecting gender*********************
		GenderDD.click();
		GenderDDSrch.sendKeys(Gender);
		if (Gender.equals("Male")) {
			GenderMale.click();
		} else if (Gender.equals("Female")) {
			GenderFemale.click();
		}

		// *****************selecting name************************
		NameText.sendKeys(Name);

		// ****************selecting mobile no****************
		MobileNo.sendKeys(Mobile);

		// ***********click on continue after selecting mobile*************
		clickOnContinueBtn();

		// *************selecting Date of Birth******************
		DOBirth.click();
		DOBirth.sendKeys(DOB_ddmm);
		DOBirth.sendKeys(Keys.ARROW_RIGHT);
		DOBirth.sendKeys(DOB_yyyy);

		// *************selecting alternate mob no********************

		AltMobNum.sendKeys(AltMobNo);

		// ************selecting email******************
		EmailText.sendKeys(Email);

		// ************selecting email******************
		PasswordText.sendKeys(Password);

		// ***********click on continue after selecting mobile*************
		clickOnContinueBtn();

		// **********selecting religion*******if christian then caste gets automatically
		// selected as christian********
		ReligionDD.click();
		ReligionDDSrch.sendKeys(Religion);
		clickOnLocatorsHelperMethod(Religion , "Christian" , "li[id$='Christian']" );

		// ************selecting mother tongue***************
		MotherTongueDD.click();
		MotherTongueDDSrch.sendKeys(MotherTongue);
		clickOnLocatorsHelperMethod(MotherTongue , "Bengali" , "li[id$='Bengali']" );

		// ************selecting dosh***************
	
		scrollByJs(driver);
		Thread.sleep(1000);
		NonManglikBtn.sendKeys(Dosh);
		ManglikBtn.sendKeys(Dosh);
		PartialManglikBtn.sendKeys(Dosh);
		if (Dosh.equals("Non-manglik")) {
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NonManglikBtn)).click();
		} else if (Dosh.equals("Manglik")) {
			ManglikBtn.click();
		} else if (Dosh.equals("Partial Manglik")) {
			PartialManglikBtn.click();
		}

		// ************click on continue**********
		clickOnContinueBtn();

		// **********selecting marital status*************
		NeverMarriedBtn.sendKeys(MaritalStatus);
		clickElementByJS(NeverMarriedBtn, driver);
		JavascriptExecutor jsMS = (JavascriptExecutor) driver;
		jsMS.executeScript("window.scrollBy(0,-350)");

		Thread.sleep(2000);
		
		// **********selecting height***************
		HeightDD.click();

		HeightDDSrch.sendKeys(Height);
		clickOnLocatorsHelperMethod(Height , "5' 11" , "li[data-select2-id$=\"5' 11\"]" );

		// ***************selecting family status****************
		FamilyStatusBtn.sendKeys(FamilyStatus);
		clickElementByJS(FamilyStatusBtn, driver);

		// ***************selecting family type****************
		scrollByJs(driver);

		FamilyTypeBtn.sendKeys(FamilyType);
		clickElementByJS(FamilyTypeBtn, driver);

		// ***************selecting family values****************
		FamilyValuesBtn.sendKeys(FamilyValues);
		clickElementByJS(FamilyValuesBtn, driver);

		// *********selecting disability************
		AnyDisabilityBtn.sendKeys(AnyDisability);
		clickElementByJS(AnyDisabilityBtn, driver);
		clickOnContinueBtn();

		// ***********selecting highest qualification****************
		HighestQualification.click();
		HighestQualificationSrch.sendKeys(HighestEducation);
		clickOnLocatorsHelperMethod(HighestEducation , "MCA" , "li[id$='MCA']" );

		// ***********selecting employed in****************
		EmployedInBtn.sendKeys(EmployedIn);
		EmployedInBtn.click();
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		
		// ***********selecting occupation****************
		OccupationDD.click();
		OccupationDDSrch.sendKeys(Occupation);
		clickOnLocatorsHelperMethod(Occupation , "Quality Assurance Engineer" , "li[id$='Quality Assurance Engineer']" );

		// ***********selecting annual income currency****************
		AnnualIncomeDD.click();
		AnnualIncomeDDSrch.sendKeys(AnnualIncomeCurrency);
		clickOnLocatorsHelperMethod(AnnualIncomeCurrency , "Rs." , "li[id$='Rs.']" );
		
		AnnualIncomeAmount.sendKeys(AnnualIncomeAmt);

		scrollByJs(driver);
		Thread.sleep(5000);

		// ***********selecting country****************
		CountryDD.click();
		CountryDDSrch.sendKeys(Country);
		clickOnLocatorsHelperMethod(Country , "India" , "li[id$='India']" );
		
		// ***********selecting state****************
		StateDD.click();
		StateDDSrch.sendKeys(State);
		clickOnLocatorsHelperMethod(State , "Maharashtra" , "li[id$='Maharashtra']" );
		
		// ***********selecting city****************
		CityDD.click();
		CityDDSrch.sendKeys(City);
		clickOnLocatorsHelperMethod(City , "Mumbai" , "li[id$='Mumbai']" );
		
		// ***********clicking continue button****************
		clickOnContinueBtn();
		
		// ***********selecting About You****************
		AboutYouText.sendKeys(AboutYou);
	}

	public static void clickOnLocatorsHelperMethod(String ValueFromExcel , String ActualValue , String locator) {
		if (ValueFromExcel.equals(ActualValue)) {
			driver.findElement(By.cssSelector(locator)).click();
		}
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void clickOnContinueBtn() throws InterruptedException {
		scrollByJs(driver);
		clickElementByJS(ContinueBtn,driver);
		Thread.sleep(1000);
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ContinueBtn)).click();
	}
	
	public static void scrollByJs(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
	}

}
