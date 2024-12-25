package ClassesAndObjects.ClassyShapesProject;

public class ShapeMetricCalculator {

    public static double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length * rectangle.width;
    }

    public static double calculateCircleArea(Circle circle){
        double phi = 3.14;
        return phi * circle.radius * circle.radius;
    }
}
