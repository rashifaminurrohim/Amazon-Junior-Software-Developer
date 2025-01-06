package Animal;

import Interface.Swim;

public class Dolphin extends Animal implements Swim {

    private int swimmingSpeed;

    private String color;

    public Dolphin() {
        setNameOfAnimal("Animal.Dolphin");
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eatingFood() {
        System.out.println("Animal.Dolphin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Animal.Dolphin: I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println("Animal.Dolphin: I am swimming at the speed " + getSwimmingSpeed());
    }
}
