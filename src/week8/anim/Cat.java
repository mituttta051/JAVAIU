package week8.anim;

public class Cat extends Animal{
    public Cat(String name, int height, int weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
