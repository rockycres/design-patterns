package patterns.creational.prototype;

/**
 *   PrototypePattern  is generally used when we have an instance of the class (prototype) and we'd like to create new objects by just copying the prototype.
 *
 */
public class PrototypePatternClient {

        public static void main(String[] args) {

                Circle originalShape = new Circle(1,"Blue");


                Circle shape = (Circle) originalShape.clone();



        }

}
