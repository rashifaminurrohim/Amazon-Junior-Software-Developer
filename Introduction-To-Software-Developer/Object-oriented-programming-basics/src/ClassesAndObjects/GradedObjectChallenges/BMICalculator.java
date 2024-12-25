package ClassesAndObjects.GradedObjectChallenges;

// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {

    // Please declare 4 attributes/properties to represent weight in pounds, height in inches, weight in kilos and height in meters
    double weightInPounds;
    double weightInKilos;
    double heightInInches;
    double heightInMeters;


    // Please use this default no arguments constructor to initialize the 4 properties to some initial values
    public BMICalculator() {
        this.weightInPounds = 0;
        this.heightInInches = 0;
        this.weightInKilos = 0;
        this.heightInMeters = 0;
    }

    // Please implement the calculateBmiImperial() method to take in weight and height to calculate and return the BMI value in the Imperial system
    public static double calculateBmiImperial(double weightInPounds, double heightInInches) {
        return (weightInPounds  * 703) / (heightInInches * heightInInches);
    }

    // Please implement the calculateBmiMetric() method to take in weight and height to calculate and return the BMI value in the Metric system
    public static double calculateBmiMetric(double weightInKilos, double heightInMeters) {
        return  weightInKilos / (heightInMeters * heightInMeters);
    }

    // Please implement the getBMICategory() method so that it takes the BMI value and returns the BMI category based on it
    public static String getBMICategory(double bmi) {
        String bmiCategory = "";
        if ( bmi < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmi < 24.9) {
            bmiCategory = "Normal weight";
        } else if (bmi < 29.9) {
            bmiCategory = "Overweight";
        } else if (bmi > 29.9) {
            bmiCategory = "Obese";
        } else {
            System.out.println("Invalid Category");
        }
        return bmiCategory;
    }
}