import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("src/documents/notes.txt");

        // read with FileInputStream
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] fileContentsAsBytes = inputStream.readAllBytes();
            for (int index = 0; index < fileContentsAsBytes.length; index++) {
                System.out.print((char) fileContentsAsBytes[index]);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }

        // read with BufferedReader that returns int
        try (BufferedReader inputStream = new BufferedReader(new FileReader(file))) {
            int character;
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
