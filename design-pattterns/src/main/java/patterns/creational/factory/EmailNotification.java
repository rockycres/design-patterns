package patterns.creational.factory;


public class EmailNotification implements Notification {
    @Override
    public void notifyUser(String msg) {
        System.out.println("Sending " + msg + " from EmailNotification");
    }
}