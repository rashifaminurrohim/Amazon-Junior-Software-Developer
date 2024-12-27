package InheritanceAndPolymorphism.CoffeeMaker;

public class Espresso extends Coffee{
    int numberOfShot;

    public Espresso(String name, String roast, double price, int numberOfShot){
        super(name, roast, price);
        this.numberOfShot = numberOfShot;
    }

    @Override
    public void printInfo() {
        super.printInfo();

    }

    public void printEspressoDetails() {
        double totalPrice = price * numberOfShot;
        System.out.println("You asked for " + numberOfShot + " servings!\n" +
                "Every serving of Espresso costs 2.5$.\n" +
                "Your total bill is " + totalPrice + "$");
    }
}
