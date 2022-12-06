package patterns.creational.abstractfactory;

/*
It is one of the best ways to create an object where object creation logic is hidden from the client.
This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.
 */
public class FactoryPatternClient {

    public static void main(String[] args) {

        AbstractFactory factoryType = FactoryProvider.getFactory("computer");

        LinuxComputer linuxComputer = (LinuxComputer) factoryType.create("linux");

        linuxComputer.runSoftware();

        factoryType = FactoryProvider.getFactory("mobile");

        AndroidMobile android = (AndroidMobile) factoryType.create("android");

        android.installApp();

    }
}
