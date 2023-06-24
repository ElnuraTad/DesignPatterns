package behaviral.chainOfResponse;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotice = new SimpleReport(Priority.ROUTINE);
        Notifier emailNotice = new EmailNotify(Priority.IMPORTANT);
        Notifier smsNotice = new SmsNotify(Priority.ASAP);

        reportNotice.setPriority(emailNotice);
        emailNotice.setPriority(smsNotice);

        reportNotice.notifyManager("Everything is ok", Priority.IMPORTANT);
        reportNotice.notifyManager("Something went wrong", Priority.IMPORTANT);
        reportNotice.notifyManager("Houstone, we had a problem here", Priority.ASAP);
    }
}
