package ConcreteAndAbstractClasses.Shape;

public class Circle extends Shape{
    private float radius;
    private String color;

    public Circle(float r) {
        this.radius = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + getColor() + " ConcreteAndAbstractClasses.Shape.Circle with radius = " + this.radius );
    }

    @Override
    public float calculateArea() {
        return (float)Math.PI * this.radius * this.radius;
    }

    @Override
    public float calculatePerimeter() {
        return 2 * (float)Math.PI * this.radius;
    }
}
