public class Tiger extends Animal {

    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    public Tiger(String nameOfAnimal) {
        super(nameOfAnimal = "Tiger");
        this.numberOfStripes = 0;
        this.speed = 0;
        this.soundLevelOfRoar = 0;
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

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    @Override
    public void eatingCompleted() {

    }
}
