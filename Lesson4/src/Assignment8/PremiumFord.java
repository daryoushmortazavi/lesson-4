package Assignment8;

public class PremiumFord extends Ford implements Premium {

    public PremiumFord(int speed, double regularPrice, String color, int length, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color, length, year, manufacturerDiscount);
    }

    @Override
    public double warrantyYears() {
        return this.getRegularPrice();
    }
}
