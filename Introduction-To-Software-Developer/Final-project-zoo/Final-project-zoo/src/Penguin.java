public class Penguin extends Animal implements Walk, Swim{

    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin(String nameOfAnimal) {
        super(nameOfAnimal);
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingFood() {
        super.eatingFood();
        System.out.println(getNameOfAnimal() + ": I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println(getNameOfAnimal() + ": I have eaten fish");
    }

    @Override
    public void swimming() {
        System.out.println(getNameOfAnimal() + ": I am swimming at the speed of " + getSwimSpeed() + " nautical miles per hour");
    }

    @Override
    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am walking at the speed of " + getWalkSpeed() + " mph");
    }
}
