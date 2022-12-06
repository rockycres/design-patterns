package patterns.creational.abstractfactory;


public class AndroidMobile implements Mobile {
    @Override
    public void installApp() {
        System.out.println("Playing song from Android App");
    }
}