package week8.anim;

public abstract class Animal {
    protected String name;
    protected int height;
    protected int weight;
    protected String color;
    
    public Animal(String name, int height, int weight, String color) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }
    void eat(){
        System.out.println("Animal is eating");
    };
    void sleep(){};
    public abstract void makeSound();



}
