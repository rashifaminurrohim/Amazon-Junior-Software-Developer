package InheritanceAndPolymorphism.OverloadingOverriding.ECommerce;

public class Product {
    String product;
    double price;

    public Product(String product, double price) {
        this.product = product;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Product " + product + ", Price: $" + price );
    }
}
