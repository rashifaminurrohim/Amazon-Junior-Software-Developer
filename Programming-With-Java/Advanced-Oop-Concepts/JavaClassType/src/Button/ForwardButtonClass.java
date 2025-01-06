package Button;

public class ForwardButtonClass extends AbstractButtonClass implements ButtonPress{

    private String forwardTo;
    private String message;

    public void setForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void buttonPress() {
        System.out.println("Forwarding " + this.message + " to " + this.forwardTo);
    }

}
