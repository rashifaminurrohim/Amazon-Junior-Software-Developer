import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EfficientLogger {
    public static void main(String[] args) {
        String filePath = "src/documents/user_activity.log";
        String newLog = "User send a message at " + System.currentTimeMillis() + "\n";

        try (BufferedWriter bw = new BufferedWriter( new FileWriter(filePath, true))){
            bw.write(newLog);
            System.out.println("Log entry added efficiently.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
