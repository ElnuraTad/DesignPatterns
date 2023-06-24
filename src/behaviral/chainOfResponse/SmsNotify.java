package behaviral.chainOfResponse;

public class SmsNotify extends Notifier{
    public SmsNotify(int nextNotifier) {
        super(nextNotifier);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending sms:" + message);

    }
}
