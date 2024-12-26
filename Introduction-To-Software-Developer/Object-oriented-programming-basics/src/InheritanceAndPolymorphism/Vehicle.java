package InheritanceAndPolymorphism;

public class Vehicle {
    String make;
    String model;
    String color;
    int speed;

    public Vehicle() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.speed = 0;
        System.out.println("Vehicle created.");
    }

    // Parameterized constructor of Vehicle
    public Vehicle(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;
        System.out.println("Vehicle created.");
    }

    public void accelerate(){
        System.out.println("The Vehicle is accelerating!");
        this.speed += 5;
    }

    public void turn(String direction){
        System.out.println("Turning" + direction);
    }

    public void brake(){
        System.out.println("The Vehicle is slowing down");
        this.speed -= 5;
    }

    public int getSpeed(){
        return speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
