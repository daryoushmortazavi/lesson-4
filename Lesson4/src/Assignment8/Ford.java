package Assignment8;

public class Ford extends Sedan{
    int year;
    int manufacturerDiscount;
    double getSalePrice(){
        return this.getRegularPrice();
    };

    public Ford(int speed, double regularPrice, String color, int length, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color, length);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
}
