package patterns.creational.factory;

public class NotifcationFactory {

    public static final String SMS = "SMS";
    public static final String EMAIL = "EMAIL";
    public static final String PUSH = "PUSH";

    public Notification createNotification(String type) {

            if (type == null || type.isEmpty()) {
                return null;
            } else {
                switch (type) {
                    case SMS:
                        return new SMSNotification();
                    case EMAIL:
                        return new EmailNotification();
                    default:
                        throw new IllegalArgumentException("Unknown Notification Type received");
                }
            }
    }

}
