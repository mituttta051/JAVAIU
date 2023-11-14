package week6;

import java.io.File;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String b = s.nextLine();
        File f = new File(b);
        if (f.exists()) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
