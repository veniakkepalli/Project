package com.qa.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTestCases extends BaseClass {

	// Verify logging into the Application using valid credentials
	@Test
	public void testCase_001() {
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getEmailTextFiled().sendKeys("sandhyakoduri98@gmail.com");
		lp.getPasswordTextField().sendKeys("Test@123");
		lp.getLoginButton().click();
	}

	// Verify logging into the Application using invalid credentials (i.e. Invalid
	// email address and Invalid Password)
	@Test
	public void testCase_002() {
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getEmailTextFiled().sendKeys("xyzabc123@gmail.com");
		lp.getPasswordTextField().sendKeys("xyzabc123");
		lp.getLoginButton().click();
	}

	// Verify logging into the Application using invalid email address and valid
	// Password)

	@Test
	public void testCase_003() {
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getEmailTextFiled().sendKeys("xyzabc123@gmail.com");
		lp.getPasswordTextField().sendKeys("Test@123");
		lp.getLoginButton().click();
	}

	// Verify logging into the Application using valid email address and invalid
	// Password)
	@Test
	public void testCase_004() {
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getEmailTextFiled().sendKeys("sandhyakoduri98@gmail.com");
		lp.getPasswordTextField().sendKeys("xyzabc123");
		lp.getLoginButton().click();
	}

	// Verify logging into the Application without providing any credentials
	@Test
	public void testCase_005() {
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getLoginButton().click();
	}

	// Verify 'Forgotten Password' link is available in the Login page and is
	// working
	@Test
	public void testCase_006() {
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getforgotPasswordLink().click();
	}

	// Verify logging into the Application using Keyboard keys (Tab and Enter)
	@Test
	public void testCase_007() {
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		driver.switchTo().activeElement().sendKeys(
				"sandhyakoduri98@gmail.com" + Keys.TAB + "Test@123" + Keys.TAB + Keys.TAB + Keys.TAB + Keys.ENTER);
	}

	// Verify Logging into the Application and browsing back using Browser back
	// button
	@Test
	public void testCase_008() {
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		lp.getLoginLink().click();
		lp.getEmailTextFiled().sendKeys("sandhyakoduri98@gmail.com");
		lp.getPasswordTextField().sendKeys("Test@123");
		lp.getLoginButton().click();
		driver.navigate().back();
	}

	// Verify Loggingout from the Application and browsing back using Browser back
	// button
	@Test
	public void testCase_009() {
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		lp.getLoginLink().click();
		lp.getEmailTextFiled().sendKeys("sandhyakoduri98@gmail.com");
		lp.getPasswordTextField().sendKeys("Test@123");
		lp.getLoginButton().click();
		hp.getLogOutOption().click();
		driver.navigate().back();
	}

	// Verify the copying of the text entered into the Password field
	@Test
	public void testCase_010() {
		LoginPage lp = new LoginPage(driver);
		Actions actions=new Actions(driver);
		actions.moveToElement(lp.getLoginLink()).click().perform();
		actions.moveToElement(lp.getPasswordTextField()).sendKeys(lp.getPasswordTextField(), "123456").keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).moveToElement(lp.getEmailTextFiled()).keyDown(Keys.CONTROL).sendKeys(lp.getEmailTextFiled(), "v").keyUp(Keys.CONTROL).perform();
	}

	@Test
	public void testCase_011() {
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getEmailTextFiled().sendKeys("sandhyakoduri98@gmail.com");
		lp.getPasswordTextField().sendKeys("Test@123");
		lp.getLoginButton().click();
		driver.close();
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}

	// Verify the Page Title and Page URL of Login page
	@Test
	public void testCase_012() {
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		String expectedTitle = "Demo Web Shop. Login";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching and its verified");

		String expectedUrl = "https://demowebshop.tricentis.com/login";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "URL is not matching and it is verified");
	}

	// Verify the Login page functionality in all the supported environments
    // refer LoginPageTestCases.xml file
	@Test
	public void testCase_013() {
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
	}

}
