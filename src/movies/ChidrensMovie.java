package movies;

/**
 * Created by JimmyRomero on 8/23/2016.
 */
public class ChidrensMovie extends Movie {

    public ChidrensMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    public double determineAmount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;

        return thisAmount;
    }

    public int determineFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
