import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class SafeLogger {
    public static void main(String[] args) {
        Path filePath = Path.of("src/documents/user_activity.log");
        String newLog = "User updated profile at " + System.currentTimeMillis() + "\n";

        try (FileChannel channel = FileChannel.open(filePath, StandardOpenOption.WRITE, StandardOpenOption.APPEND)) {
            // Lock the file exclusively
            FileLock lock = channel.lock();
            try {
                // Convert the log entry to a ByteBuffer
                ByteBuffer buffer = ByteBuffer.wrap(newLog.getBytes());
                // Write the buffer to the file
                while (buffer.hasRemaining()) {
                    channel.write(buffer);
                }
                System.out.println("Log entry added with safe concurrent access.");
            } finally {
                // Release the lock
                lock.release();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
