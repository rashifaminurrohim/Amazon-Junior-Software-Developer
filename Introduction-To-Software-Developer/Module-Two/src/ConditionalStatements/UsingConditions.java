package ConditionalStatements;

public class UsingConditions {
    public static void main(String[] args) {
        System.out.println("Hello this is Module Two!");

        // set the marks
        int marks1 = 80;
        int marks2 = 80;
        int marks3 = 80;

        // calculate the average
        int average = (marks1 + marks2 + marks3) / 3;

        // 1st level "if" condition
        if (average < 60) {
            System.out.println("Failing.");
        } else {
            //corresponding "else" body or area of control of 1st "if"

            //2nd level "if" condition
            if (average <= 69) {
                System.out.println("Below Average.");
            } else {
                // 2nd level "else" of 2nd level "if"

                //3rd level "if" condition inside 2nd level "else"
                if (average <= 79) {
                    System.out.println("Average.");
                } else {
                    //3rd level "else" of 3rd level "if"

                    //4th level "if" condition inside 3nd level "else"
                    if(average <= 89) {
                        System.out.println("Good.");
                    } else {
                        //4th level "else" of 4th level "if"
                        System.out.println("Excellent.");
                    }
                }

            }
        }

        //declare the variable for the marks
        int marks4, marks5, marks6;

        //set the marks
        marks4 =90;
        marks5 =92;
        marks6 =90;

        //calculate the average
        int averages = (marks4 + marks5 + marks6)/3;

        // when the problem says <60, what is not stated is that it should also be >=0 which we check
        if(averages < 60 && averages >= 0) {
            System.out.println("Failing.");
        }

        if(averages < 70 && averages >= 60) {
            System.out.println("Below Average.");
        }

        if(averages < 80 && averages >= 70) {
            System.out.println("Average.");
        }

        if(averages < 90 && averages >= 80) {
            System.out.println("Good.");
        }

        if(averages <= 100 && averages >= 90) {
            System.out.println("Excellent.");
        }

        //covering invalid marks
        if(averages < 0){
            System.out.println("Invalid Marks.");
        }

        // set the speed in Mph
        int carSpeed = 81;


        // 1st level "if" condition
        if (carSpeed <= 16) {
            System.out.println("1st Gear.");
        } else {
            // 1st level "else" of 1st level "if"

            //2nd level "if" condition inside 1st level "else"
            if (carSpeed <= 32) {
                System.out.println("2nd Gear.");
            } else {
                // 2nd level "else" of 2nd level "if"

                //3rd level "if" condition inside 2nd level "else"
                if (carSpeed <= 48) {
                    System.out.println("3rd Gear.");
                } else {
                    //3rd level "else" of 3rd level "if"

                    //4th level "if" condition inside 3nd level "else"
                    if(carSpeed <= 64) {
                        System.out.println("4th Gear.");
                    } else {
                        //4th level "else" of 4th level "if"

                        //5h level "if" condition inside 4th level "else"
                        if(carSpeed <= 80) {
                            System.out.println("5th Gear.");
                        } else {
                            //5th level "else" of 5th level "if"

                            System.out.println("SLOW DOWN BOSS.");
                        }
                    }
                }

            }
        }


        //set the car speed
        int carSpeeds = 60 ;

        // when the problem says <60, what is not stated is that it should also be >=0 which we check
        if(carSpeeds>=0 && carSpeeds<16) {
            System.out.println("1st Gear.");
        }

        if(carSpeeds>=17 && carSpeeds<=32) {
            System.out.println("2nd Gear.");
        }

        if(carSpeeds>=33 && carSpeeds<=48) {
            System.out.println("3rd Gear.");
        }

        if(carSpeeds>=49 && carSpeeds<=64) {
            System.out.println("4th Gear.");
        }

        if(carSpeeds>=65 && carSpeeds<=80) {
            System.out.println("5th Gear.");
        }

        if(carSpeeds > 80) {
            System.out.println("SLOW DOWN BOSS.");
        }

        //covering invalid speed
        if(carSpeeds<0){
            System.out.println("Invalid Car Speed.");
        }
    }
}
