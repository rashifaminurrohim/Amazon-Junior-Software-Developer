import java.io.*;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of the file: ");
        String fileName = keyboard.next();
        keyboard.close();
        File file = new File("src/documents/" + fileName + ".txt");

        try {
            boolean isFileCreated = file.createNewFile();
            if (isFileCreated) {
                System.out.println("File \"" + fileName + ".txt\" created successfully!");
            } else {
                System.err.println("File already exist!");
            }
        } catch (IOException ioException) {
            System.err.println("I/O Exception occurred!");
            System.err.println(ioException.getMessage());
        }

        // write using FileOutputStream
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            String fileContents = "Sample description from a file";
            byte[] fileContentBytes = fileContents.getBytes();
            outputStream.write(fileContentBytes);
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }

        // write using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write("This is a sample string content for the file.");
            System.out.println("Data written to file successfully!");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }

    }

    /**
     * Tip
     *
     * If you need to append data to an existing file, both the FileOutputStream and FileWriter classes provide overloaded constructors that accept a second boolean argument. If this argument is ‘true’, data will be appended to the end of the file instead of overwriting it.
     *
     * FileOutputStream(File file, boolean append)
     *
     * FileWriter(File file, boolean append)
     *
     * These constructors are helpful when you want to add new data to an existing file without losing the previous content. In upcoming lessons, you'll have the opportunity to practice and learn how to use these "append" methods to write to files without overwriting the existing data.
     * */
    void tips(){}
}
