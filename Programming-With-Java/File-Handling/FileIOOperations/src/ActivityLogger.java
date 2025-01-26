import java.io.FileWriter;
import java.io.IOException;

public class ActivityLogger {
    public static void main(String[] args) {
        String filePath = "src/documents/user_activity.log";
        String newLog = "User logger in at " + System.currentTimeMillis() + "\n";

        try (FileWriter fw = new FileWriter(filePath, true)){
            fw.write(newLog);
            System.out.println("Log entry added.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
