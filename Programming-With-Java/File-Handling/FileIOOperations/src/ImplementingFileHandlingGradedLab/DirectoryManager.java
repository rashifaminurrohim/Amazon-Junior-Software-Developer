package ImplementingFileHandlingGradedLab;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class DirectoryManager {

    // TODO 1a: Define a static void method called listFilesAndDirectories with a single parameter directoryPath of type String
    public static void listFilesAndDirectories(String directoryPath) {
        // TODO 1b: Create a new File object for the directoryPath
        File fileDirectory = new File(directoryPath);
        // TODO 1c: Use the listFiles() method from the File class to get an array of File objects
        File[] files = fileDirectory.listFiles();

        // TODO 1d: Check if the array is null or empty
        if (files == null || files.length == 0) {
            // If it is empty or null, print an appropriate message indicating the same
            System.out.println("The directory does not exist or is not accessible.");
        } else {
            // If not, loop through the array and print each file's name
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

    // TODO 2a: define a static void method called createDirectory with a single parameter directoryPath of type String
    public static void createDirectory(String directoryPath) {
        // TODO 2b: create a new File object for the directoryPath
        File directory = new File(directoryPath);

        // TODO 2c: check if the directory exists using the exists() method from the File class
        if (!directory.exists()) {
            // If the directory does not exist, create the directory using the mkdirs() method from the File class
            if (directory.mkdirs()){
                // Print a message indicating that the directory was created
                System.out.println("Directory created successfully: " + directoryPath);
            } else {
                System.out.println("Failed to create directory");
            }
        } else {
            // If the directory already exists, print a message indicating the same
            System.out.println("Directory already exist: " + directoryPath);
        }
    }

    // TODO 3a: Define a static void method called renameDirectory with two parameters: currentDirectory and newDirectory of type String
    public static void renameDirectory(String currentDirectory, String newDirectory) {
        // TODO 3b: create two File objects for the currentDirectory and newDirectory
        File newDir = new File(newDirectory);
        File oldDir = new File(currentDirectory);


        // TODO 3c: Check if the new directory already exists using the exists() method from the File class
        if (newDir.exists()) {
            System.out.println("Directory already exist: " + newDir.getAbsolutePath());
        }

        // TODO 3d: Use the renameTo() method from the File class to rename the old directory to the new directory
        if (!oldDir.renameTo(newDir)) {
            // If the rename fails, print an error message
            System.out.println("Renamed failed.");

        } else {
            // If the rename is successful, print a success message
            System.out.println("Directory renamed to: " + newDir.getName());

        }
    }

    // TODO 4a: Define a static void method called copyFiles with two parameters sourceDir and destDir of type String
    public static void copyFiles(String sourceDir, String destDir) {
        // TODO 4b: create Path objects for the sourceDir and destDir using the Paths.get() method
        Path destPath = Paths.get(destDir);


        // TODO 4c: Write a try-catch block to handle IOException because creating a new directory and copying files can throw an IOException
        try {
            // TODO 4d: Check if the destination directory exists using the exists() method from the Files class
            if (!Files.exists(destPath)) {
                // If the destination directory does not exist, create the directory using the createDirectories() method from the Files class
                Files.createDirectories(destPath);
            }

            // TODO 4e: Iterate through the files in the source directory using a loop
            File sourceDirectory = new File(sourceDir);
            File[] files = sourceDirectory.listFiles();
            // Check if the directory is empty or if the list is null

            // For each file, create a Path object using the file's name and the destDir
            for (File file : files) {
                Path destFilePath = destPath.resolve(file.getName());
                // Use the copy() method from the Files class to copy the file to the destination directory
                Files.copy(file.toPath(), destFilePath, StandardCopyOption.REPLACE_EXISTING);
                // Print a message indicating that the file was copied
                System.out.println("File copied from " + sourceDir + " to " + destDir);
            }
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

    // TODO 5a: Define a static void method called deleteFile with a single parameter fileName of type String
    public static void deleteFile(String fileName) {
        // TODO 5b: create a File object using the provided fileName
        File file = new File(fileName);
        // TODO 5c: Attempt to delete the file using the delete() method from the File class
        if (file.delete()) {
            // If the file is deleted successfully, print a message indicating the same
            System.out.println("File deleted.");
        } else {
            // If the file deletion fails, print an error message
            System.out.println("Delete failed.");

        }
    }

}

