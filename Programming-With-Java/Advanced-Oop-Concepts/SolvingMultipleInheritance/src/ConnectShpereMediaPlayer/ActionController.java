package ConnectShpereMediaPlayer;

public interface ActionController {
    void start();
    void pause();
    void stop();

    default void forward(){
        System.out.println("skip forward by 10 sec");
    }

    default void backward() {
        System.out.println("skip backward by 10 sec");
    }
}
