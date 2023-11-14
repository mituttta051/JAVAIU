package week11.lab.objects;

import week11.lab.interfaces.Living;
import week11.lab.interfaces.Swimmable;

public class Penguin extends Animal implements Swimmable, Living {

    @Override
    public void swim() {
        System.out.println("Pengui is swimming");
    }

    @Override
    public void stopSwimming() {
        System.out.println("AAA penguin is sinking");

    }
}
