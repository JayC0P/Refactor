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
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		StringBuilder result = new StringBuilder();
		result.append("Rental Record for " + this.getName() + "\n");
		result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

		for (Rental rental : rentals) {
			double thisAmount = 0;
			thisAmount = rental.getAmount();
			frequentRenterPoints += rental.getFrequentRenterPoints();
			// show figures for this rental
			result.append("\t" + rental.getMovie().getTitle() + "\t" + "\t" + rental.getDaysRented() + "\t"
					+ String.valueOf(thisAmount) + "\n");
			totalAmount += thisAmount;
		}

		// add footer lines
		result.append("Amount owed is " + String.valueOf(totalAmount) + "\n");
		result.append("You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points");
		return result.toString();
	}

}
