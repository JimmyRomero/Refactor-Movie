package movies;

public abstract class Movie {

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    public abstract double determineAmount(int daysRented);

    public abstract int determineFrequentRenterPoints(int daysRented);
}
