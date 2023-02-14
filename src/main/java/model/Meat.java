package model;

class Meat extends Food { //Класс наследник Food - для мяса

    public Meat(int amount, double price) {
        super(amount, price);
        isVegeterian = false;
    }
}
