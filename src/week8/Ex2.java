package week8;

public class Ex2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle(15, 20);
        shapes[1] = new Square(40);
        shapes[2] = new Triangle(12,3,13);
        shapes[3] = new Ellipse(1, 2);
        shapes[4] = new Circle(5);

        for (Shape shape :
                shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
            System.out.println(shape.toString());
        }
    }
}
