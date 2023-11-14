package week7;

import java.util.Scanner;
class Calculator {
    int a, b;
    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int add() {
        return a+b;
    }
    int sub() {
        return a-b;
    }
    int mul() {
        return a*b;
    }
    double divis() {
        if (b == 0) {
            return -1;
        }
        return (double)a/b;
    }



}
public class Lab7Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        char op = s.next().charAt(0);
        int b = s.nextInt();
        Calculator c = new Calculator(a, b);


        if (op == '+') {
            System.out.println(c.add());
        } else if (op == '-') {
            System.out.println(c.sub());
        } else if (op == '*') {
            System.out.println(c.mul());
        } else if (op == '/') {
            System.out.println(c.divis());
        }

    }
}
