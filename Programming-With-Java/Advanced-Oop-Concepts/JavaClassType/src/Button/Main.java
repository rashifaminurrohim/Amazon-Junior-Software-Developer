package Button;

public class Main {
    public static void main(String[] args) {

        SendButtonClass sendButton = new SendButtonClass();
        ForwardButtonClass forwardButton = new ForwardButtonClass();

        sendButton.setCaption("Send");
        sendButton.setSendTo("haerin@nwjns.com");
        sendButton.setMessage("Happy Birthday Newjeans!!");
        sendButton.buttonPress();

        forwardButton.setCaption("Forward");
        forwardButton.setForwardTo("minjikim@nwjns.com");
        forwardButton.setMessage(sendButton.getMessage());
        forwardButton.buttonPress();

    }
}