package com.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityMethods.UtilityClass;

public class LoginPage extends UtilityClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (id = "username")
	private List<WebElement> username;

	@FindBy (id = "password")
	private List<WebElement> password;

	@FindBy (id = "login")
	private List<WebElement> loginButton;

	public List<WebElement> getUsername() {
		return username;
	}

	public List<WebElement> getPassword() {
		return password;
	}

	public List<WebElement> getLoginButton() {
		return loginButton;
	}
	
}
