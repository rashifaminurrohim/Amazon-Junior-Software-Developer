public class Dolphin extends Animal {

    private int swimmingSpeed;

    private String color;

    public Dolphin(String nameOfAnimal) {
        super(nameOfAnimal = "Dolphin");
        this.swimmingSpeed = 0;
        this.color = "Grey";
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
    public void eatingCompleted() {

    }
}
