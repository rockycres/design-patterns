package patterns.structural.bridge;

/*

Bridge pattern lets you split a large class or a set of closely related classes into two separate hierarchies which can be developed independently of each other.

The bridge pattern allows the Abstraction and the Implementation to be developed independently
and the client code can access only the Abstraction part without being concerned about the Implementation part.

It increases the loose coupling between class abstraction and it’s implementation.

 */
public class BridgePatternClient {

    public static void main(String[] args) {
        Shape square = new SquareShape(new RedColor());
        square.draw();
    }

}
