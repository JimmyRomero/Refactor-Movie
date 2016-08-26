package org.fundacionjala.movies;

import java.util.LinkedList;
import java.util.List;

class Customer {

    private static final String BREAK_LINE = "\n";

    private final String name;

    private final List<Rental> rentals = new LinkedList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * Calculates the total of the frequent renter points
     *
     * @return The total calculation of the frequent renter points
     */
    public int calculateTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            // add frequent renter points
            frequentRenterPoints += rental.calculateFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    /**
     * Calculates the total of the amount
     *
     * @return The total calculation of the amount
     */
    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            //determine amounts for each line
            totalAmount += rental.calculateAmount();
        }
        return totalAmount;
    }

    /**
     * Create the statement
     *
     * @return The statement
     */
    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ");
        result.append(getName());
        result.append(BREAK_LINE);
        for (Rental rental : rentals) {
            //show figures for this rental
            result.append("\t");
            result.append(rental.getMovie().getTitle());
            result.append("\t");
            result.append(rental.calculateAmount());
            result.append(BREAK_LINE);
        }
        //add footer lines
        result.append("Amount owed is ");
        result.append(calculateTotalAmount());
        result.append(BREAK_LINE);
        result.append("You earned ");
        result.append(calculateTotalFrequentRenterPoints());
        result.append(" frequent renter points");
        return result.toString();
    }

    /**
     * Get the name of the customer
     *
     * @return The name of the customer
     */
    public String getName() {
        return name;
    }
}
