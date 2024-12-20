package IterativeStructures;

import java.util.Scanner;

public class ImplementingWhileLoops {
    public static void main(String[] args) {
        guessingGame();
    }

    static void guessingGame(){
        int secretNumber = 8;
        int yourGuess = 0;
        Scanner keyboard = new Scanner(System.in);

        while (yourGuess != secretNumber) {
            System.out.println("Guess number from 1 - 9: ");
            yourGuess = keyboard.nextInt();
            if (yourGuess != secretNumber) {
                System.out.println("Wrong Guess!! Try Again!");
            }
        }
        System.out.println("Congratulations! You guessed the correct number.");
        keyboard.close();

    }


}
