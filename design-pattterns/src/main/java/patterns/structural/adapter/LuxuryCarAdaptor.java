package patterns.structural.adapter;

public class LuxuryCarAdaptor implements LuxuryCar {

    Car car;

    public LuxuryCarAdaptor(Car car) {
        this.car = car;
    }


    @Override
    public void runEngineAtMaxSpeed() {
        car.runEngineNormally();
        thenAccelerate();
    }

    private void thenAccelerate() {
        System.out.println("Accelerate now");

    }
}
