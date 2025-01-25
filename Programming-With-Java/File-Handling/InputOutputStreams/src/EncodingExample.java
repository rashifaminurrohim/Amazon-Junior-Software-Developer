import java.io.*;
import java.nio.charset.StandardCharsets;

public class EncodingExample {

    public static void main(String[] args) {
        writeUTF8();
        readUTF8();
        readISO();
    }

    public static void writeUTF8() {
        // Write to a file with UTF-8 encoding
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("src/documents/PatientRecords.txt"), StandardCharsets.UTF_8)) {
            writer.write("Jose Voilà\n");
            writer.write("Özil\n");
            writer.write("李祖阳\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readUTF8() {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("src/documents/PatientRecords.txt"), StandardCharsets.UTF_8)) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * if didn't match encoding used for read and write
     * */
    public static void readISO() {
        StringBuilder content = new StringBuilder();
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("src/documents/PatientRecords.txt"), StandardCharsets.ISO_8859_1)) {
            int data;
            while ((data = reader.read()) != -1) {
                content.append((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("src/documents/PatientRecords.txt"), StandardCharsets.UTF_8)) {
            writer.write(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
