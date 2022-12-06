package patterns.creational.abstractfactory;


public class MacComputer implements Computer {
    @Override
    public void runSoftware() {
        System.out.println("Playing song from Apple App");
    }
}