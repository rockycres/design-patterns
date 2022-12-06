package patterns.creational.builder;

/**
 * Builder pattern builds a complex object using simple objects and using a step by step approach.
 *
 * It also helps in minimizing the number of parameters in the constructor and thus there is no need to pass in null for optional parameters to the constructor.
 */
public class BuilderPatternClient {

    public static void main(String[] args)
    {

        House user1 = new House.HouseBuilder("s", "s").build();

        House user2 = new House.HouseBuilder("s", "s").addInterior("s").build();


    }
}
