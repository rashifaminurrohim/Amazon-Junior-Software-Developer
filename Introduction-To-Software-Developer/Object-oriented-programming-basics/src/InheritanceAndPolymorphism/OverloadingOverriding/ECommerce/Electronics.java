package InheritanceAndPolymorphism.OverloadingOverriding.ECommerce;

public class Electronics extends Product {

    int warrantyPeriodInMonths;

    public Electronics(String product, double price, int warrantyPeriodInMonths) {
        super(product, price);
        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warrantyPeriodInMonths + " months");
    }
}
