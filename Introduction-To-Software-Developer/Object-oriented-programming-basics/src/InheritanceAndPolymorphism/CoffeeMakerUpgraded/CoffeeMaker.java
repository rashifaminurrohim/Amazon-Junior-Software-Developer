package InheritanceAndPolymorphism.CoffeeMakerUpgraded;

public class CoffeeMaker {
    public void prepareCoffee(Coffee coffeeOrder) {
        coffeeOrder.grindBeans();
        coffeeOrder.brewCoffee();
    }
}
