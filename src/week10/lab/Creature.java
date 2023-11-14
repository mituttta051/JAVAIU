package week10.lab;

abstract class Creature {
    String name = null;
    Boolean isAlive = false;

    public Creature(String name, Boolean isAlive) {
        this.name = name;
        this.isAlive = isAlive;
    }

    abstract void bear(String name);
    abstract void die();

    void shoutName() {
        if (this.name != null) {
            System.out.println(this.name);
        }
        else {
            System.out.println("Error");
        }
    }


}
