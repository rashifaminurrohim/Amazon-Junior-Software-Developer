package Animal;

import Interface.Walk;

public class Tiger extends Animal implements Walk {

    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    public Tiger() {
        setNameOfAnimal("Animal.Tiger");
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return soundLevelOfRoar;
    }

    public void setSoundLevel(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    @Override
    public void eatingFood() {
        super.eatingFood();
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Animal.Tiger: I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println("Animal.Tiger: I am moving at the speed " + getSpeed());
    }
}