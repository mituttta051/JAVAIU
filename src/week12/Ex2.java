package week12;

import java.io.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("input.txt");
             FileOutputStream out = new FileOutputStream("output.txt")
        ) {
            byte[] buffer = new byte[in.available()];
            String[] s = new String(buffer).split(" ");
            try {
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
            } catch (IndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
