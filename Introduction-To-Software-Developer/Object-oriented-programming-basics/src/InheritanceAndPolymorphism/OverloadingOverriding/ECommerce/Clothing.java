package InheritanceAndPolymorphism.OverloadingOverriding.ECommerce;

public class Clothing extends Product{

    String size;
    public Clothing(String product, double price, String size) {
        super(product, price);
        this.size = size;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
    }
}
