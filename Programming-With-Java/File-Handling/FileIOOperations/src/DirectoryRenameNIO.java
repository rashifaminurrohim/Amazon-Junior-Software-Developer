import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class DirectoryRenameNIO {
    public static void main(String[] args) {

        Path sourceDirectory = Paths.get("src/user_data/jo_grey");

        Path targetDirectory = Paths.get("src/user_data/john_smith");

        try {
            if (Files.exists(sourceDirectory)) {
                Files.move(sourceDirectory, targetDirectory, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Directory renamed successfully: " + targetDirectory);
            } else {
                System.out.println("Source directory does not exist: " + sourceDirectory);
            }
        } catch (IOException e) {
            System.out.println("Failed to rename directory: " + sourceDirectory);
            e.printStackTrace();
        }
    }
}
