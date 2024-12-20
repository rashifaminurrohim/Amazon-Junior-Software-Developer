package ConditionalStatements;

public class ManipulatingStrings {
    public static void main(String[] args) {
//        // method startsWith(String prefix)
//        String testString = "This is a test";
//
//        boolean result1 = testString.startsWith("test"); // false
//        boolean result2 = testString.startsWith("This"); // true
//
//        System.out.println("testString.startsWith(\"test\") : " + testString.startsWith("test"));
//        System.out.println("testString.startsWith(\"This\") : " + testString.startsWith("This"));
//
//        // method endsWith(String suffix)
//        boolean result3 = testString.endsWith("test"); // true
//        boolean result4 = testString.endsWith("This"); // false
//
//        System.out.println("testString.endsWith(\"test\") : " + testString.endsWith("test"));
//        System.out.println("testString.endsWith(\"This\") : " + testString.endsWith("This"));
//
//        // isEmpty() method
//        String testString1 = "This is a test";
//        String testString2 = "";
//
//        boolean stringEmpty1 = testString1.isEmpty(); // false
//        boolean stringEmpty2 = testString2.isEmpty();  // true
//
//        System.out.println("testString1.isEmpty() : " + testString1.isEmpty());
//        System.out.println("testString2.isEmpty() : " + testString2.isEmpty());
//
//        //  To determine the start index of a particular substring, you’ll employ the indexOf(String stringToSearchFor) method
//        String testString = "This is a test which is nice";
//        int indexOfSearch1= testString.indexOf("Java"); // returns -1
//        int indexOfSearch2 = testString.indexOf("is"); // returns 2
//        int indexOfSearch3 = testString.indexOf("est"); // returns 11
//
//        System.out.println("testString.indexOf(\"Java\") : " + testString.indexOf("Java"));
//        System.out.println("testString.indexOf(\"is\") : " + testString.indexOf("is"));
//        System.out.println("testString.indexOf(\"est\") : " + testString.indexOf("est"));
//
//        // substring method, create a new String by removing characters from the original String by specifying the start index number
//        String testString = "This is a test";
//        String result1 = testString.substring(3);  //”s is a test”
//        String result2 = testString.substring(12); // “st”
//
//        System.out.println("testString.substring(3) : " + testString.substring(3));
//        System.out.println("testString.substring(12) : " + testString.substring(12));
//
//        // The trim() method can be utilized to eliminate leading and trailing spaces.
//        String testString = "  This is a test	";
//        String result1 = testString.trim(); // results in “This is a test”
//
//        System.out.println("testString : #" + testString + "#");
//        System.out.println("testString.trim() : #" +  testString.trim() + "#");
//
//        // To explore if two Strings are equal without considering case sensitivity, use the syntax  equalsIgnoreCase(String stringToCompare)
//        String testString = "Java";
//
//        boolean result1 = testString.equalsIgnoreCase("java"); //true
//        boolean result2 = testString.equalsIgnoreCase("JAVA"); //true
//
//        System.out.println("testString.equalsIgnoreCase(\"java\") : " + testString.equalsIgnoreCase("java"));
//        System.out.println("testString.equalsIgnoreCase(\"JAVA\") : " +  testString.equalsIgnoreCase("JAVA"));
//
//        String testString = "Java";
//
//        // non-zero is not equal and zero means equal
//        int result1 = testString.compareTo ("java"); // returns -32
//        int result2 = testString.compareTo("JAVA"); // returns 32
//
//        int result3 = testString.compareToIgnoreCase("java"); // returns 0
//        int result4 = testString.compareToIgnoreCase("JAVA"); // returns 0
//
//
//        System.out.println("------- Comparing with respect to case ----------");
//        System.out.println("testString.compareTo (\"java\") : " + testString.compareTo ("java"));
//        System.out.println("testString.compareTo(\"JAVA\") : " +  testString.compareTo("JAVA"));
//
//        System.out.println("------- Comparing irrespective of case ----------");
//        System.out.println("testString.compareToIgnoreCase(\"java\") : " + testString.compareToIgnoreCase("java"));
//        System.out.println("testString.compareToIgnoreCase(\"JAVA\") : " +  testString.compareToIgnoreCase("JAVA"));

//        try it yourself
//        Program 1:  Create a String that contains a substring "good". Query the String whether it contains the substring "good". If it does, the output should display "You get a gift from Santa". If the substring is not present, the output should display "Next year, please".
        String testString = "if you good santa will give you a gift";
        if (testString.contains("good")) {
            System.out.println("You get a gift from Santa");
        } else {
            System.out.println("Next year, please");
        }

//        solution program 1
        //set the default string value
//        String stringToBeDisplayed = "Next year, please";
//
//        //set string that is set by you
//        String howWasLastYear = "he was good in his activities";
//
//        //check if the string "howWasLastYear" has the word "good" in it (it is case sensitive)
//        if(howWasLastYear.contains("good")) {
//
//            //if the word "good" is found change the value to be displayed
//            stringToBeDisplayed = "You get a gift from Santa";
//
//        }
//
//        // this area is the common area after the "if" condition
//        // which is always executed
//        System.out.println("Santa's Result: " + stringToBeDisplayed);
//    }

//        Program 2:  Create two Strings with different first names but the same last name. Compare the two Strings, irrespective of the case.
        String testString1 = "goOd DoGO";
        String testString2 = "GOod doGo";

        if (testString1.equalsIgnoreCase(testString2)) {
            System.out.println("it's the same lah");
        }

//        solution program 2
//        String name1= "santa";
//        String name2 ="SantA";
//
//        if(name1.equalsIgnoreCase(name2)) {
//            System.out.println("The names are the same.");
//        }
    }
}

