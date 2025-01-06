package Button;

public class SendButtonClass extends AbstractButtonClass implements ButtonPress {

    private String sendTo;
    private String message;

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void buttonPress() {
        System.out.println("Sending " + this.message + " to " + this.sendTo);
    }

}
