package price;

public class RegularPrice extends Price{

	@Override
	public double getCharge(int daysRented) {
		int thisAmount = 2;
		if (daysRented > 2)
			thisAmount += (daysRented - 2) * 1.5;
		return thisAmount;
	}

}
