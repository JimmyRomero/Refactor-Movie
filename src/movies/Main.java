package movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Jin");
        customer.addRental(new Rental(new ChidrensMovie("Inuyasha", 1),2));
        customer.addRental(new Rental(new RegularMovie("Never Back Down", 1),2));
        System.out.println(customer.statement());
    }
}