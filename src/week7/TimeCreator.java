package week7;

class Time {
    int h = 0, m = 0, s = 0;
    public Time(int h) {
        this.h = h;
    }

    public Time(int h, int m) {
        this.h = h;
        this.m = m;
    }

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

     Time inc() {
        this.s++;
        return this;
    }

    int r = h*3600+m*60+s;

}

public class TimeCreator {
    public static void main(String[] args) {
        int h1 = 12, m1 = 50;
        int h2 = 5, m2 = 12, s2 = 30;
        Time t1 = new Time(h1, m1);
        Time t2 = new Time(h2, m2, s2);

    }
}

