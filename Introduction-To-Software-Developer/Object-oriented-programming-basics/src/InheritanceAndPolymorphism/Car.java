package InheritanceAndPolymorphism;

public class Car extends Vehicle{
    int seatPosition;

    public Car(){
        super();  // Java called the default constructor of the Vehicle class -> actually is implicitly called by java
        this.seatPosition = 0;
    }
    // Parameterized constructor of Car
    public Car(String make, String model, String color){
        super(make, model, color);
        this.seatPosition = 0;
        System.out.println("Car Created.");
    }

    public void adjustSeat(int adjustment) {

        this.seatPosition += adjustment;

        if (seatPosition > 0) {
            System.out.println("Moving seat forward...");
        } else if (seatPosition < 0) {
            System.out.println("Moving seat backward...");
        } else {
            System.out.println("Seat position not changed.");
        }
    }


}
