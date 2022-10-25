import model.Apple;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.green;
import static model.constants.Colour.red;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, red);
        Apple appleGreen = new Apple(8, 60, green);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.food.add(meat);
        shoppingCart.food.add(appleRed);
        shoppingCart.food.add(appleGreen);

        System.out.println("Общая сумма товаров без скидки " + shoppingCart.getSum());
        System.out.println("Общая сумма товаров со скидкой " + shoppingCart.getSumWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + shoppingCart.getSumOfVegetarian());
    }
}
