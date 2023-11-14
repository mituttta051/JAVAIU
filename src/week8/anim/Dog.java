package week8.anim;

public class Dog extends Animal{

    public Dog(String name, int height, int weight, String color) {
        super(name, height, weight, color);
    }
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

}
