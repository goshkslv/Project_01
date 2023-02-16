package model;

public abstract class Food implements Discountable{ //Абстрактный класс с полями
    private int amount; // кол-во продуктов
    private double price; // цена за еденицу
    protected boolean isVegeterian; // флаг, который показывает, вегетарианский ли продукт

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isVegeterian() {
        return isVegeterian;
    }
    public void setVegeterian(boolean vegeterian) {
        isVegeterian = vegeterian;
    }
    @Override
    public int getDiscount() {
        return 0;
    }
}




