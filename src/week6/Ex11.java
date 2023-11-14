package week6;

public class Ex11 {
    public static void main(String[] args) {
        int[] nuts = {1, 2, 2, 1, 3, 4, 5};
        for (int i = 0; i < nuts.length - 1; i++) {
            for (int j = i + 1; j < nuts.length; j++) {
                if (nuts[i] == nuts[j]) {
                    System.out.println(nuts[j]);
                }
            }

        }
    }
}
