package org.fundacionjala.movies;

/**
 * Created by JimmyRomero on 8/24/2016.
 */
class NewReleaseMovie extends Movie {

    public NewReleaseMovie(String title ) {
        super(title);
    }

    public double calculateAmount(int daysRented) {
        return daysRented * 3;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}