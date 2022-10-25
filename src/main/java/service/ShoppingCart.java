package service;

import model.Food;
import model.constants.Discount;

import java.util.ArrayList;

public class ShoppingCart {
    public ArrayList<Food> food = new ArrayList<>();

    public double getSum() {
        double sum = 0;

        for (Food value : food) {
            sum += value.amount * value.price;
        }

        return sum;
    }

    public double getSumWithDiscount() {
        Discount discount = new Discount();

        double discountValue;
        double sum = 0;

        for (Food value : food) {
            if (value.isVegetarian) {
                discountValue = discount.getDiscount(value.colour);
            } else {
                discountValue = discount.getDiscount();
            }
            sum += value.amount * (value.price - (discountValue * value.price) / 100);
        }

        return sum;
    }

    public double getSumOfVegetarian() {
        double sum = 0;

        for (Food value : food) {
            if (value.isVegetarian) {
                sum += value.amount * value.price;
            }
        }

        return sum;
    }
}
