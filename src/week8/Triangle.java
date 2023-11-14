package week8;

public class Triangle extends Shape{
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void calculatePerimeter() {
        this.perimeter = a+b+c;

    }

    @Override
    void calculateArea() {
        double p = (double) (a + b + c) /2;
        this.area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
