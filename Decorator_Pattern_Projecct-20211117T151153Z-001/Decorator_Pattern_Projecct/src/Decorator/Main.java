package Decorator;

import Decorator.interfaces.IceCream;
import Decorator.model.BasicIceCream;
import Decorator.model.MintIceCream;
import Decorator.model.VanillaIceCream;

public class Main {

    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost $" + basicIceCream.cost());

        //Add Vanilla to the order

        IceCream vanilla = new VanillaIceCream(basicIceCream); // wrapping vanilla
        System.out.println("Adding Vanilla - cost is: $" + vanilla.cost());


        //Add Mint to the order
        IceCream mint = new MintIceCream(vanilla);
        System.out.println("Adding Mint - cost is: $" + mint.cost());


    }
}
