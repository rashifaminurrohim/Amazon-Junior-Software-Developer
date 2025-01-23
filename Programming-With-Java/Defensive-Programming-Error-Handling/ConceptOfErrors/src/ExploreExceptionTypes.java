import java.io.File;
import java.io.FileInputStream;

public class ExploreExceptionTypes {
    public static void main(String[] args) {
        File file = new File("my file.txt");
        // FileNotFoundException -> checked exception
        FileInputStream stream = new FileInputStream(file);
        // Division by zero Exception -> unchecked exception
        int number = 100/0;
    }
}
