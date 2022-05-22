package Interfaces;

public class CD implements RetailItem, Displayable{
	// Class Fields
	private double price;
	private String title;
	private String artist;
	
	// Class Constructor
	public CD(double price, String title, String artist) {
		this.price = price;
		this.title = title;
		this.artist = artist;
	}
	
	public CD() {
	}

	// Class Setters & Getters
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
//		this.storeName = "ABC";			// Final Static Field can't edit it !!!!
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	// Interface Methods that must be implemented.
	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return this.getPrice();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(
											"CD Title: " + this.getTitle() +
											"\nCD Price = " + this.getPrice() + 
											"\nCD Artist is " + this.getArtist() +
											"\nStore Name is " + storeName
											);
	}

}
