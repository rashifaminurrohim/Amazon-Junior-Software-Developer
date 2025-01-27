import java.io.*;

public class PlayerMain {
    public static void main(String[] args) {

        // Serialization
        Player rashifGamer = new Player("Rashifara", 7, 666);

        try (FileOutputStream fileOutputStream = new FileOutputStream("src/documents/player.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(rashifGamer);
            System.out.println("Player object serialized and saved to player.ser!");
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        // Deserialization
        Player restoredPlayer= null;

        try (FileInputStream fileInputStream = new FileInputStream("src/documents/player.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Object restoredObject = objectInputStream.readObject();
            restoredPlayer = (Player) restoredObject;
            System.out.println("Deserialized object: " + restoredPlayer);
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
