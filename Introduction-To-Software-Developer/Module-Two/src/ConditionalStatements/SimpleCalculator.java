package ConditionalStatements;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("input your first number: ");
        int number1 = keyboard.nextInt();

        System.out.println("input your second number: ");
        int number2 = keyboard.nextInt();

        System.out.println("Enter the operator");
        if (keyboard.hasNextLine()){
            keyboard.nextLine();
        }
        String operator = keyboard.nextLine();

        int result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;

            case "-":
                result = number1 - number2;
                break;

            case "*":
                result = number1 * number2;
                break;

            case "/":
                result = number1 / number2;
                break;

            default:
                System.out.println("The operator is invalid");
        }
        System.out.println("The result is: " + result);

    }
}
