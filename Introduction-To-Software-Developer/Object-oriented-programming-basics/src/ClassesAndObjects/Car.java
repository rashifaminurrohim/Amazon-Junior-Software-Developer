package ClassesAndObjects;

public class Car {
    // Attributes (member variables) define a Car's properties
    String make; // stores the car's make (like Ford, Toyota)
    String model; // stores the car's specific model name (like Mustang, Camry)
    String color; // stores the car's color (like Red, Silver)
    int year; // stores the car's manufacturing year (like 2020)

    // no-arguments constructor (no parameters)
    public Car(){
        // The this keyword is used within a constructor to refer to the current object being created.
        this.make = "Unknown";
        this.model = "Unknown";
        this.color = "no color";
        this.year = 0;
    }

    // parameterized constructor to initialize with specific values
    public Car(String make, String model, String color, int year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getCarDetails(){
        // build, and return a string by adding each car property with a label
        // and using new line character \n
        return "Make: " + make + "\nModel: " + model + "\nColor: " + color + "\nYear: " + year;
    }

    public void accelerate(){
        System.out.println("The car is accelerating!");
    }

    public void turn(){
        System.out.println("The car is turning!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
