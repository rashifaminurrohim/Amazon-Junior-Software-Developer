package ClassesAndObjects.Methods;

public class WritingMethodSignature {

    static double sideOfSquare;

    /**
     * the main method
     * **/
    public static void main(String[] args){
        // set the side of square
        setSquareSide();

        // call the method to calculate the area of the square
        // And store the result given back by the method in a variable
        double areaOfSquare = calculateAreaOfSquare();

        // print the result, using the values from the variables
        System.out.printf("Area of the square with side " + sideOfSquare + " is: " + "%.2f",areaOfSquare);
    }


    /**
     *  method to set the side of the square
     * **/
    public static void setSquareSide(){
        sideOfSquare = 5.2;
    }

    /**
     * method to calculate the area of the square
     * **/
    public static double calculateAreaOfSquare() {
//        double areaOfSquare = sideOfSquare * sideOfSquare;
//        return areaOfSquare;
        return sideOfSquare * sideOfSquare;
    }


}
