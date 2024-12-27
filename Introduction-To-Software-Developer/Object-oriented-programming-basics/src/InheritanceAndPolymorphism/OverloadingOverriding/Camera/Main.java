package InheritanceAndPolymorphism.OverloadingOverriding.Camera;
/**
 * Here are a few things to remember:
 *
 * A superclass reference can refer to subclass objects, enabling another dimension of polymorphism in Java.
 *
 * When a method is overridden in a subclass, and the superclass reference points to that subclass object, the overridden method in the subclass will be executed.
 *
 * This allows you to use general code with a superclass reference while benefiting from the subclass's specific behaviors.
 * **/
public class Main {
    public static void main(String[] args) {
        // Create a new Camera object
        Camera myFavoriteCamera = new Camera();

        // Take picture with default settings
        myFavoriteCamera.takePicture();

        // Take picture with a specific mode
        myFavoriteCamera.takePicture("portrait");

        // Take picture with a specific resolution
        myFavoriteCamera.takePicture(12);

        // Take picture with a specific mode and resolution
        myFavoriteCamera.takePicture("landscape", 24);

        // Create a new SmartCamera object
        SmartCamera smartCam = new SmartCamera();

        // Take picture using the smart camera with default settings
        System.out.println("\nInitiating smart camera...");
        smartCam.takePicture();

        /**
         * a superclass reference can refer to subclass objects.
         * The data type of Camera reference referring to the SmartCamera object.

         * The call to the method takePicture() stays the same
         * but triggers the overridden method from the SmartCamera class
         * because the object belongs to the SmartCamera class,
         * demonstrating Java’s polymorphism
         * **/
        Camera newCamera = new SmartCamera();
        newCamera.takePicture(); // call the takePicture() method of smartCamera class

    }
}
