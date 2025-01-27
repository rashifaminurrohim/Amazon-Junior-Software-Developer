import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExampleNIO {
    public static void main(String[] args) {
        Path directoryPath = Paths.get("src/user_data/jo_grey");

        try{
            // check if the directory already exist
            if (Files.exists(directoryPath)) {
                System.out.println("Directory already exist: " + directoryPath);
            } else {
                // Create the directory if it doesn't exist
                Files.createDirectories(directoryPath);
                System.out.println("Directory created successfully: " + directoryPath);
            }
        } catch (IOException e) {
            System.out.println("Failed to create directory: " + directoryPath);
            e.printStackTrace();
        }
    }
}
