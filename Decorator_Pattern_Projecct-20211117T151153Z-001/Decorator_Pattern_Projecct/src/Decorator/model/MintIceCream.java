package Decorator.model;

import Decorator.interfaces.IceCream;
import Decorator.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Ice-Cream!");
        return  1.50 +super.cost();
    }
}
