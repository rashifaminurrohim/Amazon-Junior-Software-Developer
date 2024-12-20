package IterativeStructures;

public class ImplementingForLoops {
    public static void main(String[] args) {
        IceCreamScoop();
        countingVowelsAndConsonants();
        stringReverse();
    }

    /**
     * Toni knows that an ice cream container holds 20 scoops. To efficiently keep track of inventory, Toni needs to know how many scoops of ice cream are left in each container after a sale. This will help him order new stock on time.
     * **/
    static void IceCreamScoop() {
        int scoopIceCream;
        System.out.println("Selling ice cream!!");
        for (scoopIceCream = 0; scoopIceCream < 20; scoopIceCream++) {
            System.out.println("This is Scoop no." + (scoopIceCream + 1));
        }
        System.out.print("No more ice cream scoops left in box.");
    }

    /**
     * Toni needs to print business cards to promote his ice cream business. Based on Toni's template, the printing shop indicates the cost per vowel is $1 and $1.50 per consonant.
     * **/
    static void countingVowelsAndConsonants(){
        String stringToCount = "TONI says ice cream PER scoop";
        String caseConvertedString = stringToCount.toLowerCase();

        int countVowels = 0;
        int countConsonants = 0;

        for (int indexPosition = 0; indexPosition < caseConvertedString.length(); indexPosition++) {
            char vowels = caseConvertedString.charAt(indexPosition);
            if (vowels=='a' || vowels=='e' || vowels=='i' || vowels=='o' || vowels=='u'){
                countVowels++;
            }
        }

        for (int indexPosition = 0; indexPosition < caseConvertedString.length(); indexPosition++) {
            char cons = caseConvertedString.charAt(indexPosition);
            if (!(cons=='a' || cons=='e' || cons=='i' || cons=='o' || cons=='u' || cons==' ')){
                countConsonants++;
            }
        }

        double consonantsPrice = countConsonants * 1.5;
        System.out.println("String : " + stringToCount);
        System.out.println("Vowels Count : " + countVowels);
        System.out.println("Consonants Count : " + countConsonants);
        System.out.println("Printing Price for consonants = $" + consonantsPrice + " for vowels = $" + countVowels );
        System.out.println("Total Price : $" + (consonantsPrice + countVowels));

    }

    /**
     * Reversal of Strings
     * After work, Toni is at the train station to go home. A train from the left passes with letters on each wagon indicating "HELLO RAILWAY". After 10 minutes, a second train rushes past from the right with the letters "YAWLIAR OLLEH".
     * <p>
     * Toni wonders if the String "TONI says ice cream PER scoop" can be reversed and whether it is a palindrome.
     **/
    static void stringReverse(){
        String stringToReverse = "TONI says ice cream PER scoop";
        String reversedString = "";

        for (int indexPosition = stringToReverse.length()-1; indexPosition >= 0; indexPosition--){
            char ch = stringToReverse.charAt(indexPosition);
            reversedString = reversedString + ch;
        }
        System.out.println("The reverse of " + stringToReverse + " is: " + reversedString);

        if (stringToReverse.equals(reversedString)){
            System.out.println(stringToReverse + " is a palindrome.");
        } else {
            System.out.println(stringToReverse + " is not a palindrome.");
        }

    }



}
