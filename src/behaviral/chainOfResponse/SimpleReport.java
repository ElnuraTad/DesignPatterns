package behaviral.chainOfResponse;

public class SimpleReport extends Notifier{
    public SimpleReport(int nextNotifier) {
        super(nextNotifier);
    }

    @Override
    public void write(String message) {
        System.out.println("Notify using simple report " + message);

    }
}
