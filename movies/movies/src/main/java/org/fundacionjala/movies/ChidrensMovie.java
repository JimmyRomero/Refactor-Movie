package org.fundacionjala.movies;

/**
 * Created by JimmyRomero on 8/23/2016.
 */
public class ChidrensMovie extends Movie {

    public ChidrensMovie(String title) {
        super(title);
    }

    public double calculateAmount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;

        return thisAmount;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
