package ConditionalStatements;
import java.util.Scanner;

// Beginning of the main class. The name of the main class and the file should be same.
public class SwitchCaseLab {
    /** TODO 1: Import the Scanner **/

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String []args) {

        /** TODO 2: Create a Scanner variable named "keyboard" **/
        Scanner keyboard = new Scanner(System.in);

        int subChoice = 1;

        /** TODO 3: A variable for getting the day of the week is given below **/
        /**         Initialize the variable to have the value 1 **/
        /** 1- is Monday, 2- is Tuesday and so on **/
        int dayOfTheWeek = 1;

        /** TODO 4: Display a menu to get the day of the week from the user **/
        System.out.println("/********** MENU *****************\n" +
                "These are the choices for week of the day. \n" +
                "Please enter only values from 1-7:\n" +
                "1. MONDAY\n" +
                "2. TUESDAY\n" +
                "3. WEDNESDAY\n" +
                "4. THURSDAY\n" +
                "5. FRIDAY\n" +
                "6. SATURDAY\n" +
                "7. SUNDAY\n" +
                "**********************************/");

        /** TODO 5: Prompt Toni for input. Also let Toni know the valid choices like (1-7). **/
        System.out.println();
        dayOfTheWeek = keyboard.nextInt();

        /** TODO 6: Create a switch with case values from 1-7 to handle the schedule **/
        /**         for the input in "dayOfTheWeek" **/
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");
                System.out.println("*********** SUB MENU FOR MONDAY ******\n" +
                        "1. Yes, I had my breakfast\n" +
                        "2. No, I would like one\n" +
                        "**************************************");
                System.out.println("Enter choice: ");
                subChoice = keyboard.nextInt();
                if (subChoice == 1) {
                    System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes");
                } else if (subChoice == 2) {
                    System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
                }else{
                    System.out.println("NO such choice available");
                }
                break;
            case 2:
                System.out.println("Tuesday: ");
                break;
            case 3:
                System.out.println("Wednesday: ");
                break;
            case 4:
                System.out.println("Thursday: ");
                break;
            case 5:
                System.out.println("Friday: ");
                break;
            case 6:
                System.out.println("Saturday: ");
                break;
            case 7:
                System.out.println("Sunday: ");
                break;
            default:
                System.out.println("this is default choice");
                /** TODO 6(a): Implement all other cases for Tuesday to Sunday **/

                /** TODO 6(b): Implement "default" to handle Toni entering  **/
                /**            values less than 1 or more than 7 **/
        }

        /** TODO 7: Introduce a "break" after each case code, except the last  **/

        /** TODO 8: Go below the TODO 2 after the creation of Scanner variable  **/
        /**         and declare a variable "subChoice" **/

        /** TODO 9: Move below the display "Monday: It is back to work....." **/
        /**         in case 1 and create a menu  **/
        /** The sub-menu inside case 1 show appear as below:

         *********** SUB MENU FOR MONDAY ******
         * 1. Yes, I had my breakfast
         2. No, I would like one
         **************************************

         **/

        /** TODO 10: After the sub-menu inside case 1, prompt for input on choice **/
        /**         from Toni and store it in the variable subChoice **/

        /** TODO 11: Display appropriate response to Toni, based on value in **/
        /**          variable subChoice using if, if-else, else **/
        /**
         1. When subChoice has value of 1 display -
         Good. Now you have a catchup meeting at 9AM Prepare your notes

         2. When subChoice has value of 2 display -
         Lets us divert on Highway 54 and have a Burger on the drive in

         3. When subChoice has any other value then 1 or 2 display -
         NO such choice available
         **/

        /**
         * 🖥️  TODO 12: If the previous code outputs the basic answers for the other days, why not try to spice it up a bit? How about, on Tuesday, you ask Toni whether the language he’ll be using during coding time is C++ or Java? Then on Wednesday, when Toni designs the program, ask if he uses a "Simple Design" or "Complex Design". Once Toni starts coding on Thursday, you could ask him if the IDE is "IntelliJ", "Eclipse" or "VS Code".
         *
         * Finally, on Friday, when he runs tests, you could ask if there were errors in the tests. And for a bit of fun, ask if Toni was going to chill "at home", "in a bar", "with friends" or "at a nightclub". Then make sure the appropriate responses are displayed.
         *
         * For case 2 (Tuesday), case 4 (Thursday), and case 7 (Sunday), use a nested switch statement, and if-else for the rest.  This is because these days have more than one possible outcome depending on another factor.
         *
         * For instance, on Tuesday (case 2), Toni might have different tasks depending on the programming language he is using that day. This can be represented as a nested switch statement within the case for Tuesday, with different tasks for each programming language.
         *
         * 🖥️  TODO 13: For the remaining days (case 1, case 3, case 5, and case 6), the activities are straightforward and do not depend on another variable, so a simple if-else statement is used.
         *
         * **/

    } //end of main method

}
//end of the main class
