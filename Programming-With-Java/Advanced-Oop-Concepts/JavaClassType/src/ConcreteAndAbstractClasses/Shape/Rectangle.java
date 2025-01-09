package ConcreteAndAbstractClasses.Shape;

public class Rectangle extends Shape {

    private float height;
    private float width;

    private String color;

    public Rectangle(float h, float w) {
        this.height = h;
        this.width = w;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + getColor() + " ConcreteAndAbstractClasses.Shape.Rectangle with width= " + this.width + " height= " + this.height);
    }

    @Override
    public float calculateArea() {
        return this.height * this.width;
    }

    @Override
    public float calculatePerimeter() {
        return this.width + this.width + this.height + this.height;
    }
}
