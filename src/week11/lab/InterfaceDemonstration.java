package week11.lab;

import week11.lab.interfaces.Living;
import week11.lab.objects.Duck;
import week11.lab.objects.Penguin;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDemonstration {
    public static void main(String[] args) {
        List<Living> livings = new ArrayList<>();
        Duck duck = new Duck();
        Penguin pengui = new Penguin();
        livings.add(duck);
        livings.add(pengui);
        duck.live();
        for (Living l:
             livings) {
            l.live();

        }
    }


}
