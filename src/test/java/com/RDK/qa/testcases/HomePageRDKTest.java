package com.RDK.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.RDK.qa.base.TestBaseRDK;
import com.RDK.qa.pages.HomePageRDK;

public class HomePageRDKTest extends TestBaseRDK {
	
	HomePageRDK homePage;
	
	public HomePageRDKTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		homePage = new HomePageRDK();
	}
	
	@Test(priority = 1)
	public void validateLogoTest() {
		Assert.assertTrue(homePage.verifyRDKLogo());
	}
	
	@Test(priority = 2)
	public void validateMailLinkTest() {
		Assert.assertTrue(homePage.verifyMailLink());
	}
	
	@Test(priority = 3	)
	public void validateFbLinkTest() {
		Assert.assertTrue(homePage.verifyFBTopLink());
	}
	
	@Test(priority = 4	)
	public void validateTwitterLinkTest() {
		Assert.assertTrue(homePage.verifyTwitterTopLink());
	}
	
	@Test(priority = 5	)
	public void validateGoogleLinkTest() {
		Assert.assertTrue(homePage.verifyGoogleTopLink());
	}
	
	@Test(priority = 6	)
	public void validateLinkedInLinkTest() {
		Assert.assertTrue(homePage.verifyLinkedInTopLink());
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
