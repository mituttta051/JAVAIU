package week11.lab.objects;

import week11.lab.interfaces.Flyable;
import week11.lab.interfaces.Living;
import week11.lab.interfaces.Swimmable;

public class Duck extends Animal implements Swimmable, Flyable, Living {
    boolean isSwimmming = false;
    boolean isFlying = false;

    @Override
    public void swim() {
        System.out.println("duck-duck");
        this.isSwimmming = true;

    }

    @Override
    public void stopSwimming() {
        System.out.println("stop duck-duck");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void stopFlying() {
        System.out.println("Duck is falling");
    }

}
