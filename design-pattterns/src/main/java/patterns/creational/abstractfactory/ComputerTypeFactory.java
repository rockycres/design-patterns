package patterns.creational.abstractfactory;

public class ComputerTypeFactory implements AbstractFactory<Computer> {

    public static final String LINUX = "linux";
    public static final String MAC = "mac";

    public Computer create(String computerType) {

            if (computerType == null || computerType.isEmpty()) {
                return null;
            } else {
                switch (computerType) {
                    case LINUX:
                        return new LinuxComputer();
                    case MAC:
                        return new MacComputer();
                    default:
                        throw new IllegalArgumentException("Unknown Notification Type received");
                }
            }
    }

}
