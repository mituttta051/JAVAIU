package week8;

public class Ellipse extends Shape{
    private int a;
    private int b;

    public Ellipse(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void calculatePerimeter() {
        this.perimeter = 3.14*(a+b);
    }

    @Override
    void calculateArea() {
        this.area = 3.14*a*b;

    }
}
