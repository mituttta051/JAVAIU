package week9;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("[0] – exit\n" +
                "[1] – print current string\n" +
                "[2] – append the string with a string that the user will input\n" +
                "[3] – insert a string that the user will input to the current string at a certain index\n" +
                "[4] – reverse current string\n" +
                "[5] – given indexes l and r delete substring in the range l to r from the current string\n" +
                "[6] – given indexes l and r replace substring in the range l to r from the current string\n" +
                "with a string that will be given in the input\n");
        Scanner s = new Scanner(System.in);
        StringBuilder instr = new StringBuilder();
        while (true) {
            System.out.println("Input the command in format [*]");
            String cmd = s.next();

            if (cmd.equals("[0]")) break;
            switch (cmd) {
                case "[1]":
                    System.out.println(instr.toString());
                    break;
                case "[2]":
                    System.out.println("Input the string");
                    instr.append(s.next());
                    break;
                case "[3]":
                    System.out.println("Insert index and then a string");
                    int i = s.nextInt();
                    String string = s.next();
                    instr.insert(i, string);
                    break;
                case "[4]":
                    instr.reverse();
                    break;
                case "[5]":
                    System.out.println("Insert l, r");
                    instr.delete(s.nextInt(), s.nextInt());
                    break;
                case "[6]":
                    System.out.println("Insert l, r, and s");
                    instr.replace(s.nextInt(), s.nextInt(), s.next());
                    break;
                default:
                    System.out.println("Wrong command");
                    break;
            }

        }
    }
}
