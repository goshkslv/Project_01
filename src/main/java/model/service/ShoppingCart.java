package model.service;

import model.Food;

public class ShoppingCart { // класс для корзины с массивами
    Food[] array;


    public ShoppingCart(Food[] array) {
        this.array = array;
    }

    public double getFoodPriceWithoutDiscount() { //общую сумму без скидки
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].getAmount() * array[i].getPrice();
        }
        return sum;
    }

    public double getFoodPriceWithDiscount() { // общую сумму товаров со скидкой
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].getAmount() * array[i].getPrice() * (100 - array[i].getDiscount())/100;
        }
        return sum;
    }

    public double getFoodPriceisVegetarian() { //сумму всех вегетарианских продуктов без скидки
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].isVegeterian()) {
                sum += array[i].getAmount() * array[i].getPrice();
            }
        }

        return sum;
    }
}
