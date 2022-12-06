package patterns.creational.factory;

/*
It is one of the best ways to create an object where object creation logic is hidden from the client.
This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.
 */
public class FactoryPatternClient {

    public static void main(String[] args) {
        NotifcationFactory factory = new NotifcationFactory();
        Notification smsNotification = factory.createNotification("SMS");
        Notification emailNotification =  factory.createNotification("EMAIL");
        smsNotification.notifyUser("Hi");

    }
}
