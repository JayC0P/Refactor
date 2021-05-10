package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code.Movie;
import code.Rental;

class RentalTest {

	@Test
	void test() {
		String title = "jefhwehfhiwhiu";
		Movie movie = new Movie(title, 0);
		Rental rental = new Rental(movie, 5);
		
		assertEquals(movie, rental.getMovie());
		assertEquals(5, rental.getDaysRented());
	}

}
