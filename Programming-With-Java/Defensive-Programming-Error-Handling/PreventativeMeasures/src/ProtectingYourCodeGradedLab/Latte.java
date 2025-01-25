package ProtectingYourCodeGradedLab;

import com.sun.jdi.InvalidTypeException;

public class Latte extends Coffee {
    String milkType;
    String syrupFlavor;

    // TODO 12: declare that the constructors throws a InvalidTypeException
    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) throws IllegalArgumentException {
        super(name, roast, price);

        // TODO 11: check whether a valid milkType is selected, if not throw an exception with a message
        switch (milkType) {
            case "whole", "skim", "almond", "oat" -> this.milkType = milkType;
            default -> throw new IllegalArgumentException("please select a valid milk type!");
        }
        this.syrupFlavor = syrupFlavor;
    }

    public void printLatteDetails() {
        System.out.println("Your latte has " + milkType + " milk and " + syrupFlavor + " flavor.");
        System.out.println("Your total bill is " + price + "$.");
    }
}
