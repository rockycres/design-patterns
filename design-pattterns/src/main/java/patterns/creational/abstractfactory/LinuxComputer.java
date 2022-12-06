package patterns.creational.abstractfactory;


public class LinuxComputer implements Computer {
    @Override
    public void runSoftware() {
        System.out.println("Playing song from Android App");
    }
}