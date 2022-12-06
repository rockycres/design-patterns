package patterns.structural.bridge;

public class SquareShape extends Shape {

    Color color;

    public SquareShape(Color color) {
        this.color = color;
    }

    public void draw(){
        System.out.println("draw square and");
        color.fill();
    }

}
