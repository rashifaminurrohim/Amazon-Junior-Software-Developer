package InheritanceAndPolymorphism.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car gt = new Car();

        // Properties accessed from Vehicle class
        gt.make = "Toyota";
        gt.model = "Alphard";
        gt.color = "Black";

        // Method accessed from the Vehicle class
        gt.accelerate();
        System.out.println(gt);

        // Create a Car object using the parameterized constructor
        Car tesla = new Car("Tesla", "Model S", "White");
        // Use inherited methods
        tesla.accelerate();
        tesla.accelerate();
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");
        tesla.brake();
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");
        tesla.adjustSeat(2);

        // Create a SportsCar object using the parameterized constructor
        SportsCar ferrari = new SportsCar("Ferrari", "F8 Tributo", "Red");
        ferrari.activateTurboBoost();
        System.out.println(ferrari.model + " running at " + ferrari.speed + " miles per hour");

    }
}
