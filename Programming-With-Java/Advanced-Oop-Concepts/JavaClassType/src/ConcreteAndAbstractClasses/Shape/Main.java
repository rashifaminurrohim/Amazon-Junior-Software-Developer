package ConcreteAndAbstractClasses.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate ConcreteAndAbstractClasses.Shape.Rectangle Area");
        System.out.print("Enter Height: ");
        float h = scanner.nextFloat();
        System.out.print("Enter Width: ");
        float w = scanner.nextFloat();
        Rectangle rectangle = new Rectangle(h,w);
        rectangle.setColor("Purple");
        rectangle.draw();
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());


        System.out.println("Calculate ConcreteAndAbstractClasses.Shape.Circle Area");
        System.out.print("Enter Radius: ");
        float r = scanner.nextFloat();
        Circle circle = new Circle(r);
        circle.setColor("Pink");
        circle.draw();
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());



    }
}
