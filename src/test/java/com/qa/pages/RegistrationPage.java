package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLinkText;

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;

	@FindBy(id = "FirstName")
	private WebElement firstNameTextFiled;

	@FindBy(id = "LastName")
	private WebElement lastNameTextField;

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPwdTextField;

	@FindBy(id = "register-button")
	private WebElement registerButton;

	@FindBy(xpath = "//div[@class='header-links']//a[@class='account']")
	private WebElement account;

	public WebElement getRegisterLink() {
		return registerLinkText;
	}
	
	public WebElement getMaleRadio() {
		return maleRadioButton;
	}
	
	public WebElement getFemaleRadio() {
		return femaleRadioButton;
	}
	
	public WebElement getFirstName() {
		return firstNameTextFiled;
	}
	
	public WebElement getLastName() {
		return lastNameTextField;
	}
	
	public WebElement getEmail() {
		return emailTextField;
	}
	
	public WebElement getPassword() {
		return passwordTextField;
	}
	
	public WebElement getConfirmPassword() {
		return confirmPwdTextField;
	}
	
	public WebElement getRegisterButton() {
		return registerButton;
	}

	

}
