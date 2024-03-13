package com.qa.testcases;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.LoginPage;
import com.qa.pages.RegistrationPage;

public class RegistrationTestCases extends BaseClass {
	RegistrationPage regPage;

	// Verify Registering an Account by providing only the Mandatory fields
	@Test
	public void testCase_001() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
		regPage.getFirstName().sendKeys("Veni");
		regPage.getLastName().sendKeys("Koduri");
		regPage.getEmail().sendKeys("sandhyakoduri98@gmail.com");
		regPage.getPassword().sendKeys("sandhya");
		regPage.getConfirmPassword().sendKeys("sandhya");
		regPage.getRegisterButton().click();
	}

	// Verify Registering an Account by providing all the fields
	@Test
	public void testCase_002() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
		regPage.getFemaleRadio().click();
		regPage.getFirstName().sendKeys("Veni");
		regPage.getLastName().sendKeys("Koduri");
		regPage.getEmail().sendKeys("sandhyakoduri98@gmail.com");
		regPage.getPassword().sendKeys("sandhya");
		regPage.getConfirmPassword().sendKeys("sandhya");
		regPage.getRegisterButton().click();
	}

	// Verify proper notification messages are displayed for the mandatory fields,
	// when you don't provide any fields in the 'Register Account' page and submit
	@Test
	public void testCase_003() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
		regPage.getRegisterButton().click();
	}

	// Verify Registering an Account when 'Female' option is selected for Gender
	// field
	@Test
	public void testCase_004() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
		regPage.getFemaleRadio().click();
		regPage.getFirstName().sendKeys("Veni");
		regPage.getLastName().sendKeys("Koduri");
		regPage.getEmail().sendKeys("sandhyakoduri98@gmail.com");
		regPage.getPassword().sendKeys("sandhya");
		regPage.getConfirmPassword().sendKeys("sandhya");
		regPage.getRegisterButton().click();
	}

	// Verify Registering an Account when 'Male' option is selected for Gender field
	@Test
	public void testCase_005() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
		regPage.getMaleRadio().click();
		regPage.getFirstName().sendKeys("Veni");
		regPage.getLastName().sendKeys("Koduri");
		regPage.getEmail().sendKeys("sandhyakoduri98@gmail.com");
		regPage.getPassword().sendKeys("sandhya");
		regPage.getConfirmPassword().sendKeys("sandhya");
		regPage.getRegisterButton().click();
	}

	// Verify different ways of navigating to 'Register Account' page
	@Test
	public void testCase_006() {
		regPage = new RegistrationPage(driver);
		LoginPage lp = new LoginPage(driver);
		regPage.getRegisterLink().click();
		lp.getLoginLink().click();
		lp.getRegisterButton().click();
	}
//Verify Registering an Account by entering different passwords into 'Password' and 'Password Confirm' fields

	@Test
	public void testCase_007() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
		regPage.getFemaleRadio().click();
		regPage.getFirstName().sendKeys("veni");
		regPage.getLastName().sendKeys("koduri");
		regPage.getEmail().sendKeys("akkepalliveni@gmail.com");
		regPage.getPassword().sendKeys("123456");
		regPage.getConfirmPassword().sendKeys("abcdef");
		regPage.getRegisterButton().click();
	}

	// Verify Registering an Account by providing the existing account details (i.e.
	// existing email address)

	@Test
	public void testCase_008() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
		regPage.getFemaleRadio().click();
		regPage.getFirstName().sendKeys("Sandhya");
		regPage.getLastName().sendKeys("Koduri");
		regPage.getEmail().sendKeys("sandhyakoduri98@gmail.com");
		regPage.getPassword().sendKeys("Test@123");
		regPage.getConfirmPassword().sendKeys("Test@123");
		regPage.getRegisterButton().click();
	}

	// Verify Registering an Account by providing an invalid email address into the
	// E-Mail field

	@Test
	public void testCase_009() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
		regPage.getFemaleRadio().click();
		regPage.getFirstName().sendKeys("Sandhya");
		regPage.getLastName().sendKeys("Koduri");
//		regPage.getEmail().sendKeys("sandhya");
//		regPage.getEmail().sendKeys("sandhya@");
		regPage.getEmail().sendKeys("sandhya@gmail");
		regPage.getPassword().sendKeys("Test@123");
		regPage.getConfirmPassword().sendKeys("Test@123");
		regPage.getRegisterButton().click();
	}

	// Verify Registering an Account by using the Keyboard keys

	@Test
	public void testCase_010() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
		regPage.getFemaleRadio().click();
		regPage.getFemaleRadio().sendKeys(Keys.TAB + "veni" + Keys.TAB + "Koduri" + Keys.TAB + "akkepalliveni@gmai.com"
				+ Keys.TAB + "Test@123" + Keys.TAB + "Test@123" + Keys.TAB + Keys.ENTER);
	}


	// Verify whether the Password fields in the Register Account page are following
	// Password Complexity Standards

	@Test
	public void testCase_012() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
		regPage.getFemaleRadio().click();
		regPage.getFirstName().sendKeys("Sandhya");
		regPage.getLastName().sendKeys("Koduri");
		regPage.getEmail().sendKeys("sandhyakoduri98@gmail.com");
		regPage.getPassword().sendKeys("12345");
		regPage.getRegisterButton().click();
	}

	// Verify Registring an Account, by filling 'Password' field and not filling
	// 'Password Confirm' field

	@Test
	public void testCase_013() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
		regPage.getFemaleRadio().click();
		regPage.getFirstName().sendKeys("Sandhya");
		regPage.getLastName().sendKeys("Koduri");
		regPage.getEmail().sendKeys("sandhyakoduri98@gmail.com");
		regPage.getPassword().sendKeys("Test@123");
		regPage.getRegisterButton().click();
	}

	// Verify the Page URL, Page Title of 'Register Account' Page

	@Test
	public void testCase_014() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
		String expectedTitle = "Demo Web Shop. Register";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching and its verified");

		String expectedUrl = "https://demowebshop.tricentis.com/register";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "URL is not matching and it is verified");
	}

	// Verify 'Register Account' functionality in all the supported environments
    // refer RegistrationPageTestCases.xml File
	@Test
	public void testCase_015() {
		regPage = new RegistrationPage(driver);
		regPage.getRegisterLink().click();
	}

}
