import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {
    /**
     * try with resources automatically close the input stream, and make less code written
     * */
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/test.txt")){
            int content;
            while ((content = fis.read()) != -1 ){
                System.out.println((char) content);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
