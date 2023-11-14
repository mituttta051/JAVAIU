package week10;

public class Lecture {
    public static void main(String[] args) {
        Animal a = new Lion();
        a = new Frog();

        if (a instanceof Lion) {
            int s = a.f1;
        }
        else if (a instanceof Frog) {
            int s = ((Frog)a).f3;
        }
    }
}
