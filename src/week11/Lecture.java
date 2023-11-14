package week11;
interface Features {
    int numOfLegs();
    boolean canFly();
    boolean canSwim();
}

class Duck implements Features {

    @Override
    public int numOfLegs() {
        return 0;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}

public class Lecture {
}
