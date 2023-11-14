package week8;

public abstract class Shape{
    protected double perimeter;
    protected double area;
    abstract void calculatePerimeter();
    abstract void calculateArea();

    @Override
    public String toString() {
        return "Shape{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
