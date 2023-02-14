package model;

import model.costant.Colour;

class Apple extends Food { //Класс наследник Food - для яблок
    String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        isVegeterian = true;
    }
    @Override
    public int getDiscount() {
        if (this.colour == Colour.COLOUR_R){
            return 60;
        }
        return 0;
    }
}
