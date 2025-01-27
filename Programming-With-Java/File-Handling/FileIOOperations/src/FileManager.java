import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class FileManager {
    /**
     * Using the File class to create a file
     */
    public static String createFileForUpload(String directory, String filename) {
        File file = new File(directory, filename);
        try {
            if (file.createNewFile()) {
                return "File created successfully: " + file.getAbsolutePath();
            } else {
                return "File already exist: " + file.getAbsolutePath();
            }
        } catch (IOException e) {
            return "An error occurred while creating the file: " + e.getMessage();
        }
    }


    /**
     * Using the File class to delete a file
     */
    public static String deleteTempFile(String filePath) {
        File tempFile = new File(filePath);
        try {
            if (tempFile.exists()) {
                if (tempFile.delete()) {
                    return "File deleted.";
                } else {
                    return "Delete failed.";
                }
            } else {
                return "File not found.";
            }
        } catch (SecurityException e) {
            return "Permission denied.";
        } catch (Exception e) {
            return "An unknown error occurred " + e.getMessage();
        }

    }

    /**
     * Using the File class to rename a file
     */
    public static void renameFile(String oldNamePath, String newNamePath) {
        File oldFile = new File(oldNamePath);
        File newFile = new File(newNamePath);
        try {
            if (!oldFile.exists()) {
                System.out.println("Source file not found.");
                return;
            }

            if (newFile.exists()) {
                System.out.println("Target file already exist");
                return;
            }

            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed to: " + newFile.getName());
            } else {
                System.out.println("Renamed failed.");
            }

        } catch (SecurityException e) {
            System.out.println("Permission denied.");
        } catch (Exception e) {
            System.out.println("An unknown error occurred " + e.getMessage());
        }

    }

    /**
     * Using Java NIO to create a file
     */
    public static void createFile(String filePath) {
        Path path = Paths.get(filePath);

        try {
            Files.createFile(path);
            System.out.println("File created at: " + path.toString());

        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exist.");
        } catch (AccessDeniedException e) {
            System.out.println("Access denied: Unable to create the file.");
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected unknown error occurred. " + e.getMessage());
        }

    }

    /**
     * Using Java NIO to delete a file
     */
    public static void deleteFile(String filePath) {
        Path path = Paths.get(filePath);

        try {
            Files.delete(path);
            System.out.println("File deleted at: " + path.toString());

        } catch (NoSuchFileException e) {
            System.out.println("File not found.");
        } catch (AccessDeniedException e) {
            System.out.println("Access denied: Unable to delete the file.");
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected unknown error occurred. " + e.getMessage());
        }

    }

    /**
     * Using Java NIO to rename a file
     */
    public static void renameFileNIO(String oldFilePath, String newFilePath) {
        Path oldPath = Paths.get(oldFilePath);
        Path newPath = Paths.get(newFilePath);

        try {
            Files.move(oldPath, newPath);
            System.out.println("File renamed from " + oldPath + " to " + newPath);

        } catch (NoSuchFileException e) {
            System.out.println("Source file not found.");
        } catch (AccessDeniedException e) {
            System.out.println("Access denied: Unable to delete the file.");
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected unknown error occurred. " + e.getMessage());
        }

    }

    /**
     * Using Java NIO to copy a file
     */
    public static void copyFileNIO(String sourcePath, String targetPath) {
        Path source = Paths.get(sourcePath);
        Path target = Paths.get(targetPath);

        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied from " + source + " to " + target);

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


}
