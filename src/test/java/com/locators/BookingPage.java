package com.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityMethods.UtilityClass;

public class BookingPage extends UtilityClass {

	public BookingPage() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy (id = "first_name")
		private List<WebElement> firstName;
		
		@FindBy (id = "last_name")
		private List<WebElement> lastName;
		
		@FindBy (id = "address")
		private List<WebElement> address;
		
		@FindBy (id = "cc_num")
		private List<WebElement> creditCardNumber;
		
		@FindBy (id = "cc_type")
		private List<WebElement> creditCardType;
		
		@FindBy (id = "cc_exp_month")
		private List<WebElement> expiryMonth;
		
		@FindBy (id = "cc_exp_year")
		private List<WebElement> expiryYear;
		
		@FindBy (id = "cc_cvv")
		private List<WebElement> cvv;
		
		@FindBy (id = "book_now")
		private List<WebElement> BookButton;
		
		@FindBy (id = "order_no")
		private List<WebElement> ticketId;
		
		public List<WebElement> getFirstName() {
			return firstName;
		}

		public List<WebElement> getLastName() {
			return lastName;
		}

		public List<WebElement> getAddress() {
			return address;
		}

		public List<WebElement> getCreditCardNumber() {
			return creditCardNumber;
		}

		public List<WebElement> getCreditCardType() {
			return creditCardType;
		}

		public List<WebElement> getExpiryMonth() {
			return expiryMonth;
		}

		public List<WebElement> getExpiryYear() {
			return expiryYear;
		}

		public List<WebElement> getCvv() {
			return cvv;
		}

		public List<WebElement> getBookButton() {
			return BookButton;
		}

		public List<WebElement> getTicketId() {
			return ticketId;
		}
		
	
}
