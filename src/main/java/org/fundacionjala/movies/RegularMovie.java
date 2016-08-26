package org.fundacionjala.movies;

/**
 * Calculates the amount and frequent renter points for regular movies.
 */
public class RegularMovie extends Movie {

    /**
     * @param title The title of the movie
     */
    public RegularMovie(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;

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
