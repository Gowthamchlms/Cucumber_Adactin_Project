package com.stepDefinition;


import com.locators.PageObjectManager;
import com.utilityMethods.UtilityClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends UtilityClass {

	PageObjectManager page = new PageObjectManager();
	
	@Given("User has to verify whether he navigated to the prope urlr {string}")
	public void user_has_to_verify_whether_he_navigated_to_the_prope_urlr(String url) {
		browserLaunch();
		url(url, 15);
	}
	
	@When("User has to enter the Username {string} & Password {string}")
	public void user_has_to_enter_the_Username_Password(String username, String password) {
	    fill(page.getPage1().getUsername().get(0), username);
	    fill(page.getPage1().getPassword().get(0), password);
	   
	}

	@Then("User has to click the login button to enter into home page")
	public void user_has_to_click_the_login_button_to_enter_into_home_page() {
		 click(page.getPage1().getLoginButton().get(0));
		 print("User gets loged in");
		 
	}

	@Given("User is in the search hotel page")
	public void user_is_in_the_search_hotel_page() {
	    print("User is in the Home page");
	}

	@When("User has to feed the location {string}")
	public void user_has_to_feed_the_location(String location) {
	    fill(page.getPage2().getLocation().get(0), location);
	}

	@When("User has to feed the hotel name {string}")
	public void user_has_to_feed_the_hotel_name(String hotelName) {
	  fill(page.getPage2().getHotels().get(0), hotelName);
	}

	@When("User has to feed the room type {string}")
	public void user_has_to_feed_the_room_type(String roomType) {
	    fill(page.getPage2().getRoomType().get(0), roomType);
	}

	@When("User has to feed the number of rooms {string}")
	public void user_has_to_feed_the_number_of_rooms(String NumberofRooms) {
	   fill(page.getPage2().getRoomNos().get(0), NumberofRooms);
	}

	@When("User has to feed the number of Adults {string}")
	public void user_has_to_feed_the_number_of_Adults(String adultsPerRoom) {
	   fill(page.getPage2().getAdultsPerRoom().get(0), adultsPerRoom);
	}

	@When("User has to feed the number of Childrens {string}")
	public void user_has_to_feed_the_number_of_Childrens(String childrensPerRoom) {
	 fill(page.getPage2().getChildsPerRoom().get(0), childrensPerRoom);   
	}

	@Then("User has to click the search button in order to search for the requirements")
	public void user_has_to_click_the_search_button_in_order_to_search_for_the_requirements() {
	  click(page.getPage2().getSubmitButton().get(0));
	}

	@Given("User is in the confirmation details page {string}")
	public void user_is_in_the_confirmation_details_page(String text1) {
	   System.out.println(text1);
	}

	@When("User has to click the select button {string}")
	public void user_has_to_click_the_select_button(String text2) {
	    click(page.getPage3().getSelectButton().get(0));
		System.out.println(text2);
	}

	@Then("User has to click the Continue button and verify whether he gets navigated to the booking page")
	public void user_has_to_click_the_Continue_button_and_verify_whether_he_gets_navigated_to_the_booking_page() {
	    click(page.getPage3().getContinueButton().get(0));
		print("User confirms the details to book");
	}
	
	@Given("User is in the booking page")
	public void user_is_in_the_booking_page() {
	    print("User gets entered into the Booking page");
	}

	@When("User has to feed the First name {string}")
	public void user_has_to_feed_the_First_name(String firstName) {
	    fill(page.getPage4().getFirstName().get(0), firstName);
	}

	@When("User has to feed the Last name {string}")
	public void user_has_to_feed_the_Last_name(String lastName) {
	    fill(page.getPage4().getLastName().get(0), lastName);
	}

	@When("User has to feed the Billing address {string}")
	public void user_has_to_feed_the_Billing_address(String address) {
	   fill(page.getPage4().getAddress().get(0), address);
	}

	@When("User has to feed the Credit card number {string}")
	public void user_has_to_feed_the_Credit_card_number(String creditCardnumber) {
	   fill(page.getPage4().getCreditCardNumber().get(0), creditCardnumber);
	}

	@When("User has to feed the Credit card type {string}")
	public void user_has_to_feed_the_Credit_card_type(String creditCardType) {
	  dropDownByVisibletext(page.getPage4().getCreditCardType().get(0), creditCardType);
	}

	@When("User has to feed the Expiry month {string}")
	public void user_has_to_feed_the_Expiry_month(String expiryMonth) {
	   dropDownByVisibletext(page.getPage4().getExpiryMonth().get(0), expiryMonth);
	}

	@When("User has to feed the Expiry year {string}")
	public void user_has_to_feed_the_Expiry_year(String expiryYear) {
	  dropDownByVisibletext(page.getPage4().getExpiryYear().get(0), expiryYear);
	}

	@When("User has to feed the cvv {string}")
	public void user_has_to_feed_the_cvv(String cvv) {
	   fill(page.getPage4().getCvv().get(0), cvv);
	}

	@When("User has to click the book now button and check verify whether the ticket has been booked")
	public void user_has_to_click_the_book_now_button_and_check_verify_whether_the_ticket_has_been_booked() {
	   click(page.getPage4().getBookButton().get(0));
	   print("User has clicked the book now button");
	}

	@Then("User has to print the unique generated ticket ID")
	public void user_has_to_print_the_unique_generated_ticket_ID() {
	    String ticketId = page.getPage4().getTicketId().get(0).getAttribute("value");
	    System.out.println("The generated Unique Ticket Id is: " + ticketId );
	}
	
}
