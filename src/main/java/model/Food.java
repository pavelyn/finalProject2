package model;

public abstract class Food {
    public int amount;
    public double price;
    public boolean isVegetarian;
    public String colour;

    Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    Food(int amount, double price, boolean isVegetarian, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
        this.colour = colour;
    }
}
