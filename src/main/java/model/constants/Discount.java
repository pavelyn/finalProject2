package model.constants;

import model.Discountable;

public class Discount implements Discountable {
    public double getDiscount(String colour) {
        if (colour.equalsIgnoreCase("red")) {
            return 60;
        }
        return 0;
    }
}
