package week6;

import java.io.File;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String b = s.nextLine();
        if ('\\' == b.charAt(b.length() - 1)) {
            System.out.println("Directory");
        } else {
            System.out.println("File");
        }
    }
}
