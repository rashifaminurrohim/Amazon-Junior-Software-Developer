package ConditionalStatements;

public class WritingConditionalStatements {
    public static void main(String[] args) {

        int moneyLeftWithToni = 200;

        //1(a): Put your if-statement here to check if moneyLeftWithToni> =300.
        if (moneyLeftWithToni >= 300) {
            //1(b): Put the display statements within the curly braces of the if.
            System.out.println("Go To Las Vegas \n" +
                    "Enjoy some luck games \n" +
                    "Enjoy some concerts \n" +
                    "Enjoy fine dining \n" +
                    "Go on a helicopter ride \n" +
                    "Go shop for some souvenirs");
        } // ->  Removing the curly braces, limited the control of the if statement to only one line of code, which means the scope of the statement is over just one line of code:
        else if (moneyLeftWithToni >= 200) {
            System.out.println("Go to Hoover Dam");
        } else if (moneyLeftWithToni >= 100) {
            System.out.println("Go to Area 51");

        } else if (moneyLeftWithToni >= 50) {
            System.out.println("Have an Ice Cream");

        } else {
            System.out.println("Think about the money spent");
        }
        System.out.println("On trip to parents.");
    }
}
