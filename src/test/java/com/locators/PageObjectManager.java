package com.locators;

public class PageObjectManager {

	LoginPage page1;
	SearchHotelPage page2;
	SelectHotelPage page3;
	BookingPage page4;
	
	
	public LoginPage getPage1() {
		return (page1 == null) ? page1 = new LoginPage() : page1;
	}

	public SearchHotelPage getPage2() {
		return (page2 == null) ? page2 = new SearchHotelPage() : page2;
	}

	public SelectHotelPage getPage3() {
		return (page3 == null) ? page3 = new SelectHotelPage() : page3;
	}

	public BookingPage getPage4() {
		return (page4 == null) ? page4 = new BookingPage() : page4;
	}
	
	
}
