package week9;

enum Color {
    RED,
    GREEN,
    YELLOW;
    private Color()
    {
        System.out.println("Called for: " + this.toString());
    }
    public void colorInfo()
    {
        System.out.println("Universal color");
    }
}

public class tutorial {
    public static void main(String[] args) {
        Color c = Color.RED;
        System.out.println(c);
        c.colorInfo();

    }
}