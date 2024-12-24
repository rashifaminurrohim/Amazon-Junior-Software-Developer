package ClassesAndObjects;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        Car myFirstCar = new Car();

        myFirstCar.make = "Mercedes-Benz";
        myFirstCar.model = "AMG-GT 63";
        myFirstCar.color = "Black";
        myFirstCar.year = 2023;
        String test = myFirstCar.getCarDetails();


        // array of Car objects
        Car[] cars = new Car[5];

        // object of Scanner class
        Scanner scanner = new Scanner(System.in);

        // loop through the array of cars
        for(int index = 0; index < 5; index++ ){

            // create a new car object at current index
            cars[index] = new Car();

            // prompt the user for details
            System.out.println("Enter details for car " + (index + 1));

            System.out.print("car's company? ");
            cars[index].make = scanner.next();
            System.out.print("car's model? ");
            cars[index].model = scanner.next();
            System.out.print("car's color? ");
            cars[index].color = scanner.next();
            System.out.print("year's created? ");
            cars[index].year = scanner.nextInt();
            scanner.nextLine();

        }

        for (int index = 0; index < 5; index++){
            System.out.println("Car Number " + (index + 1));
            String carsCollection = cars[index].getCarDetails();
            System.out.println(carsCollection);
        }

    }

}
