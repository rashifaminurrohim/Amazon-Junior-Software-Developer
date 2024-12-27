package InheritanceAndPolymorphism.OverloadingOverriding.Camera;

public class Camera {

    // overloading example

    // Method to take a picture with default settings
    public void takePicture(){
        System.out.println("Taking an 8 megapixels picture in portrait mode.");
    }
    // Method to take a picture with a specific mode
    public void takePicture(String mode){
        System.out.println("Taking picture in " + mode + " mode.");
    }
    // Method to take a picture with a specific resolution
    public void takePicture(int resolution) {
        System.out.println("Taking picture in " + resolution + " megapixels.");
    }
    // Method to take a picture with a specific mode and resolution
    public void takePicture(String mode, int resolution){
        System.out.println("Taking a " + resolution + " megapixels picture in " + mode + " mode.");
    }




}
