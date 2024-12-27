package InheritanceAndPolymorphism.CoffeeMaker;

public class Latte extends Coffee{

    String milkType;
    String syrupType;
    double syrupPrice;

    public Latte(String name, String roast, double price, String milkType, String syrupType) {
        super(name, roast, price);
        this.milkType = milkType;
        this.syrupType = syrupType;
        setSyrupPrice();
    }

    public void setSyrupPrice() {
        if (syrupType.equalsIgnoreCase("vanilla")){
            syrupPrice = 1.5;
        } else if (syrupType.equalsIgnoreCase("caramel")) {
            syrupPrice = 1.5;
        } else if (syrupType.equalsIgnoreCase("hazelnut")) {
            syrupPrice = 1.5;
        }
    }

    public void printLatteDetails() {
        double totalPrice = price + syrupPrice;
        System.out.println("Your latte has "+ milkType +" milk and "+ syrupType +" syrup. Your total bill is " + totalPrice + "$");
    }

}
