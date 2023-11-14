package week10.lab;

public class Human extends Creature {
    public Human(String name, Boolean isAlive) {
        super(name, isAlive);
    }

    @Override
    void bear(String name) {
        this.name = name;
        this.isAlive = true;
        System.out.println("The " + this.getClass() + this.name + " was born");

    }
    @Override
    void die() {
        System.out.println("The " + this.getClass() + this.name + " has died(");

    }
}
