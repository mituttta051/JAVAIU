package week6;

public class Ex9 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 65, 54, 24};
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        System.out.println(sum/arr.length);

    }
}
