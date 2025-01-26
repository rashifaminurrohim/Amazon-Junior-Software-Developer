import java.io.*;
import java.util.Random;

public class WorkWithBinaryFiles {
    public static void main(String[] args) {
        binaryWrite();
        binaryRead();
    }

    public static void binaryWrite() {
        int sensorId = 1;
        Random rd = new Random();
        float sensorValue = rd.nextFloat();
        String timeStamp = "2025-1-26 13:02:54";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/documents/sensorData.bin"))) {
            dos.writeInt(sensorId);
            dos.writeFloat(sensorValue);
            dos.writeUTF(timeStamp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void binaryRead() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("src/documents/sensorData.bin"))) {
            while (true) {
                try {
                    int sensorId = dis.readInt();
                    float sensorValue = dis.readFloat();
                    String timeStamp = dis.readUTF();
                    System.out.println("id: " + sensorId + " sensor value: " + sensorValue + " timestamp: " + timeStamp);
                } catch (EOFException e) {
                    break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
