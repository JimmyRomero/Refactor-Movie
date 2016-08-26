package org.fundacionjala.movies;

/**
 * Calculates the amount and frequent renter points for children movies.
 */
public class ChidrensMovie extends Movie {

    /**
     * @param title The title of the movie
     */
    public ChidrensMovie(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;

        return thisAmount;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
