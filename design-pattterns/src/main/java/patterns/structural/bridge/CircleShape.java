package patterns.structural.bridge;

public class CircleShape extends Shape {

    Color color;

    public CircleShape(Color color) {
        this.color = color;
    }

    public void draw(){
        System.out.println("draw circle and ");
        color.fill();
    }

}
