package org.fundacionjala.movies;

/**
 * Calculates the amount and frequent renter points for new release movies.
 */
class NewReleaseMovie extends Movie {

    /**
     * @param title The title of the movie
     */
    public NewReleaseMovie(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(int daysRented) {
        return daysRented * 3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
