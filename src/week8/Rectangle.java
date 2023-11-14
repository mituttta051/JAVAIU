package week8;

public class Rectangle extends Shape{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void calculatePerimeter() {
        this.perimeter = 2*(a+b);
    }

    @Override
    void calculateArea() {
        this.area = a*b;
    }


}
