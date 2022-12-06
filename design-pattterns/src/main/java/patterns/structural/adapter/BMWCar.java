package patterns.structural.adapter;

public class BMWCar implements LuxuryCar {

    @Override
    public void runEngineAtMaxSpeed() {
        System.out.println("BMW Car Running fast");
    }

}
