package week8;

import week8.anim.Animal;
import week8.anim.Cat;
import week8.anim.Cow;
import week8.anim.Dog;

public class Ex1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cow("Myrka", 125, 100, "black");
        animals[1] = new Cat("Mysia", 15, 13, "black-white");
        animals[2] = new Dog("Bysia", 50, 20, "grey");
        for (Animal animal: animals) {
            animal.makeSound();
        }
    }
}
