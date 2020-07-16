package Assignment8;

import javax.swing.*;

public class Truck extends Car {
    int weight;
    double getSalePrice(){
        if (weight > 2000)
            return this.getRegularPrice()*0.9;
        else
            return this.getRegularPrice()*0.5;
     }

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
};

