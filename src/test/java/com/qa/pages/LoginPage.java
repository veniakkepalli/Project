package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Log in")
	private WebElement logInLinkText;

	@FindBy(css = "input[value='Register']")
	private WebElement registerButton;

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(css = "input[value='Log in']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='Forgot password?']")
	private WebElement forgotPasswordLink;

	@FindBy(xpath = "//div[@class='header-links']//a[@class='account']")
	private WebElement account;

	public WebElement getLoginLink() {
		return logInLinkText;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getEmailTextFiled() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getforgotPasswordLink() {
		return forgotPasswordLink;
	}
	
	

}
