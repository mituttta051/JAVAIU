package week8.anim;

public class Cow extends Animal{
    public Cow(String name, int height, int weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Mooo");
    }
}
