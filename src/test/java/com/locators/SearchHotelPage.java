package com.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityMethods.UtilityClass;

public class SearchHotelPage extends UtilityClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "location")
	private List<WebElement> location;
	
	@FindBy (id = "hotels")
	private List<WebElement> hotels;
	
	@FindBy (id = "room_type")
	private List<WebElement> roomType;
	
	@FindBy (id = "room_nos")
	private List<WebElement> roomNos;
	
	@FindBy (id = "adult_room")
	private List<WebElement> adultsPerRoom;
	
	@FindBy (id = "child_room")
	private List<WebElement> childsPerRoom;
	
	@FindBy (id = "Submit")
	private List<WebElement> submitButton;

	public List<WebElement> getLocation() {
		return location;
	}

	public List<WebElement> getHotels() {
		return hotels;
	}

	public List<WebElement> getRoomType() {
		return roomType;
	}

	public List<WebElement> getRoomNos() {
		return roomNos;
	}

	public List<WebElement> getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public List<WebElement> getChildsPerRoom() {
		return childsPerRoom;
	}

	public List<WebElement> getSubmitButton() {
		return submitButton;
	}
	
	
}
