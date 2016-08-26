package org.fundacionjala.movies;

class Rental {

    private Movie movie;

    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * Get the movie
     *
     * @return The movie
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Calculate the amount
     *
     * @return The calculation of the amount
     */
    public double calculateAmount() {
        return movie.calculateAmount(daysRented);
    }

    /**
     * Calculate the renter points
     *
     * @return The calculation of the renter points
     */
    public int calculateFrequentRenterPoints() {
        return movie.calculateFrequentRenterPoints(daysRented);
    }
}