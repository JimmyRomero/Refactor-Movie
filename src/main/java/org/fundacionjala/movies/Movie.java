package org.fundacionjala.movies;

public abstract class Movie {

    private String title;

    /**
     * @param title The title of the movie
     */
    public Movie(String title) {
        this.title = title;
    }

    /**
     * Get the title of the movie
     *
     * @return The title of the movie
     */
    public String getTitle() {
        return title;
    }

    /**
     * Calculates the amount
     *
     * @return The calculation of the amount
     */
    public abstract double calculateAmount(int daysRented);

    /**
     * Calculates the frequent renter points
     *
     * @return The calculation of the amount
     */
    public abstract int calculateFrequentRenterPoints(int daysRented);
}
