package ConnectShpereMediaPlayer;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player=new MediaPlayer();
        player.start();
        player.pause();
        player.increase(50);
        player.decrease(30);
        player.forward();
        player.backward();
    }
}
