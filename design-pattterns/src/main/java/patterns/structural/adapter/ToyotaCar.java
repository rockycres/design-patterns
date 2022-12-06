package patterns.structural.adapter;

public class ToyotaCar implements Car {

    @Override
    public void runEngineNormally() {
        System.out.println("Toyota Car Running normal");
    }

}
