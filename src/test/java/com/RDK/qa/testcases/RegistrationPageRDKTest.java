package com.RDK.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.RDK.qa.base.TestBaseRDK;
import com.RDK.qa.pages.HomePageRDK;
import com.RDK.qa.pages.RegistrationPageRDK;
import com.RDK.qa.util.TestUtilRDK;

public class RegistrationPageRDKTest extends TestBaseRDK {
	
	RegistrationPageRDK registrationPage;
	HomePageRDK homePage;
	String sheetName = "RegisterRDK";
	
	public RegistrationPageRDKTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();
		
		homePage = new HomePageRDK();
		registrationPage = new RegistrationPageRDK();
		homePage.clickOnRegisterBtn();
	}
	
	@DataProvider
	public Object[][] getRegistrationData(){
		Object data[][] = TestUtilRDK.getTestData(sheetName);
		return data;
	}
	 
	@Test(priority = 1 , dataProvider = "getRegistrationData")
	public void validateRegistrationUser(String IMLookingFor, String Gender , String Name, String Mobile,
			String DOB_ddmm, String DOB_yyyy, String AltMobNo, String Email, String Password, String Religion,
			String MotherTongue, String Dosh,String MaritalStatus, String Height, String FamilyStatus, String FamilyType,
			String FamilyValues, String AnyDisability, String HighestEducation, String EmployedIn,
			String Occupation, String AnnualIncomeCurrency, String AnnualIncomeAmt,
			String Country, String State, String City, String AboutYou) throws InterruptedException {
		
		registrationPage.registerUser(IMLookingFor, Gender, Name, Mobile, DOB_ddmm, DOB_yyyy, AltMobNo, Email, Password,
				Religion, MotherTongue, Dosh, MaritalStatus, Height, FamilyStatus, 
				FamilyType, FamilyValues, AnyDisability, HighestEducation, EmployedIn, Occupation, 
				AnnualIncomeCurrency, AnnualIncomeAmt, Country, State, City, AboutYou);
		
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println();
		//driver.quit();
	}
}
