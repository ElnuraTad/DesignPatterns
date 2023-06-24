package behaviral.chainOfResponse;

public class EmailNotify extends Notifier{
    public EmailNotify(int nextNotifier) {
        super(nextNotifier);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);

    }
}
