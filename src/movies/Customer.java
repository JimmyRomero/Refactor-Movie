package movies;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();
    private double totalAmount;
    private int frequentRenterPoints;

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        clearTotals();
        return makeHeader() + makeRentalLines() + makeSummary();
    }

    private void clearTotals() {
        totalAmount = 0;
        frequentRenterPoints = 0;
    }

    private String makeHeader() {
        return "Rental Record for " + getName() + "\n";
    }

    private String makeRentalLines() {
        String rentalLines = "";

        for (Rental rental : rentals)
            rentalLines += makeRentalLine(rental);

        return rentalLines;
    }

    private String makeRentalLine(Rental rental) {
        double thisAmount = rental.determineAmount();
        frequentRenterPoints += rental.determineFrequentRenterPoints();
        totalAmount += thisAmount;

        return formatRentalLine(rental, thisAmount);
    }

    private String formatRentalLine(Rental rental, double thisAmount) {
        return "\t" + rental.getTitle() + "\t" + thisAmount + "\n";
    }

    private String makeSummary() {
        return "Amount owed is " + totalAmount + "\n" +
                "You earned " + frequentRenterPoints +
                " frequent renter points\n";
    }
}
