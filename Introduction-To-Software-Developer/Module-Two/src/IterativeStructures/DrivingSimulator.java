package IterativeStructures;

import java.util.Scanner;

public class DrivingSimulator {
    public static void main(String[] args) {
        // TODO 1: Declare the necessary variables for the car's state and add scanner object
        boolean isEngineOn = false;
        String gear = "P";
        int speed = 0;
        int choice = 0;
        Scanner keyboard = new Scanner(System.in);

        while (choice != 5) {
            // TODO 2: Display the current state of the car (engine state, gear, speed)
            System.out.println("------ Car Dashboard ------");
            System.out.println("engine on: " + isEngineOn);
            System.out.println("gear: " + gear);
            System.out.println("Speed: " + speed);

            System.out.println("------ Car Menu ------\n" +
                    "1. Turn on/off the engine\n" +
                    "2. Change gear (P, D, R)\n" +
                    "3. Accelerate\n" +
                    "4. Brake\n" +
                    "5. Exit");


            // TODO 4: Prompt the user for their choice and store it in the 'choice' variable
            System.out.print("What do you want to do? : ");
            choice = keyboard.nextInt();


            // TODO 5: Implement a switch statement to handle the different menu choices
            switch (choice) {
                case 1:
//                    first try
//                    String YN = "N";
//                    System.out.println("Do you want to turn your car on? {Y/N}");
//                    if (keyboard.hasNextLine()) {
//                        keyboard.nextLine();
//                    }
//                    YN = keyboard.nextLine();

//                    if (YN.equals("Y")) {
//                        isEngineOn = true;
//                        System.out.println("Your engine is On");
//                    } else if (YN.equals("N")) {
//                        isEngineOn = false;
//                        System.out.println("Your engine is Off");
//                    } else {
//                        System.out.println("There's no such choice");
//                    }
                    isEngineOn = !isEngineOn;
                    if (isEngineOn) {
                        System.out.println("Your engine is On");
                    } else {
                        System.out.println("Your engine is Off");
                    }
                    break;

                case 2:
                    System.out.println("Switch your gear? P/D/R");
                    if (keyboard.hasNextLine()) {
                        keyboard.nextLine();
                    }
                    gear = keyboard.nextLine();
                    switch (gear) {
                        case "P":
                            System.out.println("you are on P mode");
                            break;
                        case "D":
                            System.out.println("you are on Drive mode");
                            break;
                        case "R":
                            System.out.println("you are on Reverse mode");
                            break;
                        default:
                            System.out.println("There's no such choice");
                    }
                    break;

                case 3:
                    if (isEngineOn && !gear.equals("P")) {
                        speed += 10;
                    } else {
                        System.out.println("You cannot accelerate while engine is off or in Park (P) gear.");
                    }
                    break;

                case 4:
                    if (speed >= 10) {
                        speed -= 10;
                    } else {
                        System.out.println("The car is not moving");
                    }
                    break;
                default:
                    System.out.println("There's no such choice");
            }
        }

        // TODO 3: Add print statements for each variable you want to display or options available to the user

        // TODO 6: Make sure the program runs until the user decides it's time to stop. Consider enclosing TODO 2 -> TODO 5 above in a while loop!
        System.out.println("It's great to driving with you ;)");
    }
}
