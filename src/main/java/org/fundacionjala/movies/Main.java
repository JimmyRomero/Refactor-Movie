package org.fundacionjala.movies;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Jin");
        customer.addRental(new Rental(new RegularMovie("The Revenant"), 2));
        customer.addRental(new Rental(new NewReleaseMovie("Terminator"), 2));
        System.out.println(customer.statement());
    }
}
