import java.io.*;

public class FilePathExample {
    public static void main(String[] args) {
        // Define the file paths
        String notesPath = "src/documents/notes.txt";
        String docsPath = "src/documents/projects-docs.pdf";
        String imagesPath = "src/documents/images";
        String diagramPath = "src/documents/images/diagram.png";

        checkFileOrDirectory(notesPath);
        checkFileOrDirectory(docsPath);
        checkFileOrDirectory(imagesPath);
        checkFileOrDirectory(diagramPath);

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

    private static void checkFileOrDirectory(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("Path: " + file.getAbsolutePath());
            if (file.isFile()) {
                System.out.println("This path points to a file.");
            } else if (file.isDirectory()) {
                System.out.println("This path points to a directory.");
            }
        } else {
            System.out.println("The path \"" + path + "\" does not exist.");
        }
        System.out.println();
    }
}
