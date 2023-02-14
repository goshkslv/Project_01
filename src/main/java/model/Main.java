package model;

import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food appleR = new Apple(10, 50, "red");
        Food appleG = new Apple(8, 60, "green");

        Food[] tot = new Food[3];
        tot[0] = meat;
        tot[1] = appleR;
        tot[2] = appleG;

        ShoppingCart shoppingCart = new ShoppingCart(tot);
        System.out.println(shoppingCart.getFoodPriceWithoutDiscount());
        System.out.println(shoppingCart.getFoodPriceWithDiscount());
        System.out.println(shoppingCart.getFoodPriceisVegetarian());

    }
}