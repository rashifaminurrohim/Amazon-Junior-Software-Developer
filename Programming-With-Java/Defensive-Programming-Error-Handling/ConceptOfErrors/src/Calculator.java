import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {
    int firstNumber;
    int secondNumber;

    int add() {
        return firstNumber + secondNumber;
    }

    // numbers.txt file -> 42 56
    void readNumbersFromFile() {
        // Unhandled exception: java.io.FileNotFoundException
        /* Scanner fileScanner = new Scanner(new File("src/numbers.txt"));
        int firstNumber = fileScanner.nextInt();
        int secondNumber = fileScanner.nextInt(); */
    }

    // Handling Checked Exceptions

    // 1. Adding the exception to the method signature.
    void readNumbersFromFileThrows() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("src/numbers.txt"));
        int firstNumber = fileScanner.nextInt();
        int secondNumber = fileScanner.nextInt();
    }

    void readNumbersFromFileTryCatch() {
        try {
            Scanner fileScanner = new Scanner(new File("src/numbers.txt"));
            int firstNumber = fileScanner.nextInt();
            int secondNumber = fileScanner.nextInt();
        } catch (FileNotFoundException fileNotFoundException){
            System.err.println(fileNotFoundException.getMessage());
        }
    }



}
