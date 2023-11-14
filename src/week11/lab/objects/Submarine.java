package week11.lab.objects;

import week11.lab.interfaces.Swimmable;

public class Submarine implements Swimmable {
    boolean isSwimming = false;
    @Override
    public void swim() {
        System.out.println("bubbles");
        this.isSwimming = true;
    }

    @Override
    public void stopSwimming() {
        if (this.isSwimming) {
            System.out.println("stop bubbles");
        }
        else {
            System.out.println("Submarine is on the ground");
            this.isSwimming = false;
        }

    }
}
