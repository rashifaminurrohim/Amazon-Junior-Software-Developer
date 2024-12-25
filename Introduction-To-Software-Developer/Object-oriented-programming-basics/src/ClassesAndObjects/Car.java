package ClassesAndObjects;

public class Car {
    String make; // stores the car's make (like Ford, Toyota)
    String model; // stores the car's specific model name (like Mustang, Camry)
    String color; // stores the car's color (like Red, Silver)
    int year; // stores the car's manufacturing year (like 2020)
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
