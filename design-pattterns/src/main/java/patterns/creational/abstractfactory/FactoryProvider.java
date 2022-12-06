package patterns.creational.abstractfactory;

/*
It is one of the best ways to create an object where object creation logic is hidden from the client.
This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.
 */
public class FactoryProvider {

        public static AbstractFactory getFactory(String choice){

            if("computer".equalsIgnoreCase(choice)){
                return new ComputerTypeFactory();
            }
            else if("mobile".equalsIgnoreCase(choice)){
                return new MobileTypeFactory();
            }

            return null;
        }

}
