package WritingDifferentFileTypes;

import java.io.*;
import java.util.Scanner;

public class Main {
    //TODO 3: add a static method here. Use textFileWrite() as name, it won't return any value.
    //Inside the method, declare an object of Person class and use the toString() method to obtain
    public static void textFileWriter() {
        Person person = new Person("Rashif", 17, 50.8f);
        //TODO 4: create object of FileWriter class, it points to file1.txt
        try (FileWriter writer = new FileWriter("src/WritingDifferentFileTypes/file1.txt")) {
            //call the write() method of FileWriter to save the data of the Person object in the file
            writer.write(person.toString());
            //the string representation
            //TODO 5: put the file writing code in try block, and catch the IO exception
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //TODO 6: Define printWrite() method, a static method that doesn’t return any data.
    public static void printWrite() {
        //TODO 7: Take inputs from the user with Scanner class, for name, age and weight.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.nextLine();
        System.out.print("Your age: ");
        int age = scanner.nextInt();
        System.out.print("Your weight: ");
        float weight = scanner.nextFloat();
        //  Instantiate Person object with the inputs
        Person person = new Person(name, age, weight);
        //TODO 8: Declare object of PrintWriter class, which refers to file2.txt file in the current folder.
        try (PrintWriter printWriter = new PrintWriter("src/WritingDifferentFileTypes/file2.txt")){
        //   Call its println() method, to write the object string returned by toString() method
        printWriter.println(person.toString());
        //TODO 9: Put the code in try catch block for IOException
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outputStreamWrite() {
        //TODO 13: Place all the file activity inside the try-catch block.
        //TODO 11: Open a FileOutputStream object, pointing towards file3.txt file
        try(FileOutputStream outputStream = new FileOutputStream("src/WritingDifferentFileTypes/file3.txt")){
            Person person = new Person("Rashif", 17, 50.8f);
            //TODO 10: Declare a byte array to store a list of numbers.
            byte[] fileContentsAsByte = person.toString().getBytes();
            //TODO 12: call the write() method of FileOutputStream object to print each element in the array.
            outputStream.write(fileContentsAsByte);
            // Use for loop for the purpose
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dosWrite() {
        //TODO 17: Place the entire file writing code in try-catch block
        //TODO 15: Use Scanner class to read name, age, and weight.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.nextLine();
        System.out.print("Your age: ");
        int age = scanner.nextInt();
        System.out.print("Your weight: ");
        float weight = scanner.nextFloat();
        //  Instantiate Person object with the inputs
        Person person = new Person(name, age, weight);
        //TODO 14: Declare an object of DataOutputStream class.
        // Use object of FileOutputStream class as argument to its constructor.
        // The FileOutputStream object refers to file4.dat
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/WritingDifferentFileTypes/file4.dat"))){
            //TODO 16: Call writeUTF(), writeInt(), and writeDouble() methods of DataOutputStream object
            // to write respectively the name, age and weight attributes of the Person object.
            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeFloat(weight);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        //TODO 18: call the static methods from main() method
        textFileWriter();
        printWrite();
        outputStreamWrite();
        dosWrite();
    }
}
