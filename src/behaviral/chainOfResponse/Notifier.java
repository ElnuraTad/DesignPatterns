package behaviral.chainOfResponse;

public abstract class Notifier {
    private Notifier priority;
    private Notifier nextNotifier;

    public Notifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void setPriority(Notifier priority) {
        this.priority = priority;
    }

    public void notifyManager(String message, int level){
        if(level >= priority){
            write(message);
    } if(nextNotifier != null){
            nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
