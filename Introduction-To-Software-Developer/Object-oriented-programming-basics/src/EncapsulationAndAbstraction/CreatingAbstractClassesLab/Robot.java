package EncapsulationAndAbstraction.CreatingAbstractClassesLab;

import java.util.Scanner;

public abstract class Robot {

    Scanner keyboard;

    /** TODO 1: Cut the of "modeOfOperation" property declaration from
     *          SideKick.java and paste it here.
     *          From now on we will use
     *          the term "move" for cut and paste from one class to
     *          another. Cut out the comments for the property too
     *          and put it here.
     **/
    /** mode of operation  **/
    private int modeOfOperation;


    /** TODO 2: Move the declaration of "batteryCharge" to this class
     *          from SideKick.java to here
     **/
    /** charge of battery  **/
    private int batteryCharge;


    /** TODO 3: Create a default constructor and move the initialization
     *          of the property "modeOfOperation" and "batteryCharge"
     *          from the constructor of SideKick.java to here.
     **/
    /** default constructor **/
    public Robot() {
        keyboard = new Scanner(System.in);
        // initial charge of battery is 0
        batteryCharge = 0 ;

        // set default to cleaning or 1
        modeOfOperation = 1;

    }


    /** TODO 4: Move the setters and getters for property
     *          "modeOfOperation"
     *          from SideKick.java to here.
     **/
    public int getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(int modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    /** TODO 5: Move the setters and getters for property
     *          "batterCharge"
     *          from SideKick.java to here.
     **/
    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    /** TODO 6: Move the method "rechargeBattery()" for
     *          recharging battery
     *          from SideKick.java to here.
     **/
    public void rechargeBattery(){
        System.out.println("Plug into socket.....");
        System.out.print("Charging ..");
        for (int i = 0; i <= 100; i += 10) {
            System.out.print(".");
            batteryCharge = i;

        }
        System.out.println("\nUnplug from socket.....");
        System.out.println("Fully charged.....");

    }

    /** TODO 7: Move the method "displayBatteryLevel()"
     *          for displaying battery
     *          charge level from SideKick.java to here.
     **/
    public void displayBatteryLevel(){
        System.out.println("The battery charge is at :" + batteryCharge + " %.");
    }


    /** TODO 8: Prevent objects of this class from being
     *          created by making
     *         this class abstract.
     **/

    /** TODO 16: Declare two abstract methods
     *           "setChoice" and "takeAction"
     *           with the return type "void"
     **/
    // method to set choice
    public abstract void setChoice();

    // method to take action
    public abstract void takeAction();

}



