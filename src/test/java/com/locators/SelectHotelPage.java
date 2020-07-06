package com.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityMethods.UtilityClass;

public class SelectHotelPage extends UtilityClass {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "radiobutton_0")
	private List<WebElement> selectButton;
	
	@FindBy (id = "continue")
	private List<WebElement> continueButton;

	public List<WebElement> getSelectButton() {
		return selectButton;
	}

	public List<WebElement> getContinueButton() {
		return continueButton;
	}
	
	
}
