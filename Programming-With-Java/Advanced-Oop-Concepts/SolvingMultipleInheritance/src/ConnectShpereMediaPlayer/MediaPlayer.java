package ConnectShpereMediaPlayer;

public class MediaPlayer implements MediaController{
    @Override
    public void start() {
        System.out.println("Player has started");
    }

    @Override
    public void pause() {
        System.out.println("player paused");
    }

    @Override
    public void stop() {
        System.out.println("player stopped");
    }

    @Override
    public void increase(int up) {
        System.out.println("volume level increased to "+up+"");
    }

    @Override
    public void decrease(int down) {
        System.out.println("volume level decreased to "+down+"");
    }
}
