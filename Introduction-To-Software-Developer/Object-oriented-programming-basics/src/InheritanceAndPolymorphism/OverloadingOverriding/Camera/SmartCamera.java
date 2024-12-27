package InheritanceAndPolymorphism.OverloadingOverriding.Camera;

public class SmartCamera extends Camera {
    @Override
    public void takePicture() {
        // Call the superclass version of the method
        super.takePicture();
        // Add new functionality
        System.out.println("Applying AI to enhance the picture.");
    }
}
