package code;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String newname) {
		name = newname;
	}

	public void addRental(Rental newRental) {
		rentals.add(newRental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		StringBuilder result = new StringBuilder();
		result.append("Rental Record for " + this.getName() + "\n");
		result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");
		result.append(getRentalRecordTable());
		result.append("Amount owed is " + String.valueOf(getTotalCharge()) + "\n");
		result.append("You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points");
		return result.toString();
	}
	
	public double getTotalCharge() {
		double totalAmount = 0;
		for (Rental rental : rentals) {
			totalAmount += rental.getCharge();
		}
		return totalAmount;
	}
	
	public String getRentalRecordTable() {
		StringBuilder result = new StringBuilder();
		for (Rental rental : rentals) {
			result.append("\t" + rental.getMovie().getTitle() + "\t" + "\t" + rental.getDaysRented() + "\t"
					+ String.valueOf(rental.getCharge()) + "\n");
		}
		return result.toString();
	}
	
	public int getTotalFrequentRenterPoints() {
		int totalFrequentRenterPoints = 0;
		for (Rental rental : rentals) {
			totalFrequentRenterPoints += rental.getFrequentRenterPoints();
		}
		return totalFrequentRenterPoints;
	}
}
