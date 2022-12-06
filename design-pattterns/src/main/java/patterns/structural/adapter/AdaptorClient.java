package patterns.structural.adapter;

/*
Adapter design pattern allows two unrelated interfaces to work together.
An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.
 */
public class AdaptorClient {

    public static void main(String args[])
    {
        Car car = new ToyotaCar();
        car.runEngineNormally();

        LuxuryCar luxuryCar = new BMWCar();
        luxuryCar.runEngineAtMaxSpeed();

        LuxuryCarAdaptor carAdapter = new LuxuryCarAdaptor(car);
        carAdapter.runEngineAtMaxSpeed();
    }


}
