package week11.lab.Ex2;

import week11.lab.objects.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateListOfAnimals {
    List<Animal> animals = new ArrayList<>();

    void addAnimal(Animal a) {
        this.animals.add(a);

    }

    void removeAnimal(Animal a) {
        this.animals.remove(a);
    }

    void updateAnimal(Animal a, String n) {
        a.setName(n);
    }

    void displayAnimals() {
        Iterator<Animal> i = animals.iterator();
        while (i.hasNext()) {
            System.out.println(i.next().getName());
        }
        
        animals.forEach(animal -> {
            System.out.println(animal.getName());
        });
        animals.forEach(this::printAnimal);
        animals.forEach(animal -> animal.printName());
    }

    void printAnimal(Animal animal){
        System.out.println(animal.getName());
    }
}
