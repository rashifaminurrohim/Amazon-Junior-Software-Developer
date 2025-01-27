package ReadingWritingObjectLab.solution;

import java.io.*;

public class VideoSettings implements Serializable {
    // Ensures class version consistency during serialization
    private static final long serialVersionUID = 1L;
    private int volumeLevel = 6;    // e.g., 0 to 100
    private double playbackSpeed = 1.0;  // e.g., 0.5x, 1x, 1.5x, etc.

    // Default constructor
    public VideoSettings() {}

    // Constructor
    public VideoSettings(int volumeLevel, double playbackSpeed) {
        this.volumeLevel = volumeLevel;
        this.playbackSpeed = playbackSpeed;
    }

    // Getters and setters
    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public double getPlaybackSpeed() {
        return playbackSpeed;
    }

    public void setPlaybackSpeed(double playbackSpeed) {
        this.playbackSpeed = playbackSpeed;
    }

    // Serialize the settings to a file
    public static void serializeSettings(VideoSettings settings, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(settings);
        } catch (IOException e) {
            System.err.println("Error saving settings: " + e.getMessage());
        }
    }

    // Deserialize the settings from a file
    public static VideoSettings deserializeSettings(String filePath) {
        VideoSettings settings = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            settings = (VideoSettings) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading settings: " + e.getMessage());
            // Return default settings in case of error
            settings = new VideoSettings();
        }
        return settings;
    }

}
