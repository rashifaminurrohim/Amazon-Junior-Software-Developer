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
