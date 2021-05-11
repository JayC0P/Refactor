package code;

import price.ChildrensPrice;
import price.NewReleasePrice;
import price.Price;
import price.RegularPrice;

public class Movie {
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	private String title;
	private Price price;

	public Movie(String title, int pricecode) {
		this.title = title;
		this.price = getPrice(pricecode);
	}
	
	private Price getPrice(int pricecode) {
		switch (pricecode) {
		case REGULAR:
			return new RegularPrice();
		case NEW_RELEASE:
			return new NewReleasePrice();
		case CHILDRENS:
			return new ChildrensPrice();
		default:
			throw new IllegalArgumentException("Incorrect Price Code.");
		}
	}

	public String getTitle() {
		return title;
	}
	
	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
}