package patterns.creational.factory;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser(String msg) {
        System.out.println("Sending " + msg + " from SMSNotification");
    }
}
