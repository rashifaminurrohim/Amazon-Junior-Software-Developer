package ClassesAndObjects.Methods;

public class KitchenHelperChallenges {

    /**
     * challenges 1
     * **/
    public static double calculateIngredientQuantity(int servings, double originalQuantity)
    {
        // Your code here!
        // Calculate the adjusted ingredient quantity
        // replace 0.0 with the adjusted quantity
        return servings * originalQuantity;
    }

    /**
     * challenges 2
     * **/
    public static void spiceUpDish(int spiceLevel){
        switch (spiceLevel){
            case 1 :
                System.out.println("You can add some salt and black pepper");
                break;
            case 2:
                System.out.println("You can add some paprika and cumin.");
                break;
            case 3:
                System.out.println("You can add some chili powder and garlic powder.");
                break;
            case 4:
                System.out.println("You can add some cayenne pepper and curry powder.");
                break;
            case 5:
                System.out.println("You can add some ghost pepper and habanero pepper.");
                break;
            default:
                System.out.println("Invalid spice level. Please enter a number between 1 and 5.");
                break;
        }
    }

    public static void greetGuest(String name, String timeOfTheDay){

        String convertedTime = timeOfTheDay.toLowerCase().trim();

        switch (convertedTime) {
            case "morning" -> System.out.println("Good Morning " + name);
            case "afternoon" -> System.out.println("Good Afternoon " + name);
            case "evening" -> System.out.println("Good Evening " + name);
            case "night" -> System.out.println("Good Night " + name);
            default -> System.out.println("Hi how are you " + name);
        }
    }

    public static void main(String[] args) {
        // Calling the method
        // Replace the arguments with your own values
        double newQuantity = calculateIngredientQuantity(4, 2.5);
        System.out.println("The adjusted ingredient quantity is: " + newQuantity);
        spiceUpDish(3);
        greetGuest("rashif", "morning");
    }
}
