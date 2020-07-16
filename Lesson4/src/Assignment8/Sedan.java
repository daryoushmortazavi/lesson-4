package Assignment8;

public class Sedan extends Car {

    int length;

    double getSalePrice(){
        if (length > 2000)
            return this.getRegularPrice()*0.9;
        else
            return this.getRegularPrice()*0.5;
    }

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }
}
