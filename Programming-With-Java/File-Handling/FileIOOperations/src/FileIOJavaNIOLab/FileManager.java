package FileIOJavaNIOLab;

import java.nio.file.*;
import java.io.IOException;

public class FileManager {

    // Define the copyFile method with two parameters: sourcePath and targetPath
    private static void copyFile(String sourcePath, String targetPath) {

        // Convert the sourcePath string into a Path object
        // TODO: Convert the targetPath string into a Path object
        Path source = Paths.get(sourcePath);
        Path target = Paths.get(targetPath);

        // Use a try-catch block to handle potential I/O exceptions
        try {

            // TODO: Copy the source file to the target location, replacing any existing file
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            // TODO: Print a message indicating that the file has been successfully copied
            System.out.println("File successfully copied from " + source + " to " + target);
        } catch (NoSuchFileException e) {
            System.out.println("Source file not found.");
        } catch (FileAlreadyExistsException e) {
            System.out.println("Target file already exist.");
        } catch (AccessDeniedException e) {
            System.out.println("Access denied: Unable to copy the file.");
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected unknown error occurred. " + e.getMessage());
        }
    }

    // Main method to test the copyFile function
    public static void main(String[] args) {
        // Specify the source and target file paths
        String sourceFile = "src/FileIOJavaNIOLab/source_folder/textFile1.txt";
        String targetFile = "src/FileIOJavaNIOLab/target_folder/textFile1.txt";

        // Call the copyFile method with the specified source and target paths
        copyFile(sourceFile, targetFile);
    }
}

