public class Tiger extends Animal implements Walk{

    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    public Tiger() {
        this.numberOfStripes = 1;
        this.speed = 1;
        this.soundLevelOfRoar = 1;
    }

    public Tiger(String nameOfAnimal, int numberOfStripes, int speed, int soundLevelOfRoar) {
        super(nameOfAnimal);
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.soundLevelOfRoar = soundLevelOfRoar;
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
    public void eatingFood() {
        super.eatingFood();
        System.out.println(getNameOfAnimal() + ": I am eating delicious meat");
    }

    @Override
    public void eatingCompleted() {
        System.out.println(getNameOfAnimal() + ": I have eaten meat");
    }

    @Override
    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am walking at the speed of " + getSpeed() + " mph");
    }
}
