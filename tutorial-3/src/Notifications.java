
interface Notification {
    void send(String recipient, String message);
}

class EmailNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[EMAIL] To: " + recipient + " | Message: " + message);
    }
}

class SMSNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[SMS] To: " + recipient + " | Message: " + message);
    }
}

public class Notifications {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        email.send("Saurab@university.edu", "Your fee payment is due tomorrow.");
        sms.send("+977-9843423545", "Exam schedule has been updated.");

        Notification[] notifiers = { email, sms };
        for (Notification n : notifiers) {
            n.send("saurab@university.edu", "Library books due in 2 days.");
        }
    }
}
 