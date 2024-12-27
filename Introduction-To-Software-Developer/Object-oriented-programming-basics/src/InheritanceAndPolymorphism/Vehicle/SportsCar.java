package InheritanceAndPolymorphism.Vehicle;

public class SportsCar extends Car {
    int turboBoost;

    public SportsCar(String make, String model, String color) {
        super(make, model, color);
        this.turboBoost = 0;
        System.out.println("SportsCar Created");
    }

    public void activateTurboBoost(){
        super.accelerate();
        this.turboBoost += 50;
        super.speed += turboBoost;
        System.out.println("Turbo boost Activated");
    }

}
