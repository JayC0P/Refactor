package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code.Movie;

class MovieTest {

	@Test
	void test() {
		
		String title0 = "jefhwehfhiwhiu";
		Movie movie0 = new Movie(title0, 0);
		assertEquals(0, movie0.getPriceCode());
		assertEquals(title0, movie0.getTitle());
		
		}

}
