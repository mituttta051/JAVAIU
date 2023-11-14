package week6;

public class Ex8 {
    public static void main(String[] args) {
        int n = 128;
        String b = Integer.toBinaryString(n);
        String o = Integer.toOctalString(n);
        String h = Integer.toHexString(n);
        System.out.println(b+" "+o+" "+h);

    }
}
