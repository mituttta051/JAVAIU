package week9;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

import java.util.Arrays;

enum Drinks {
    DOBRIYCOLA("DobryiCola", 90 ), FANTA("Fanta", 85), SPRITE("Sprite", 70);

    Drinks(String name, int price) {
        this.name = name;
        this.price = price;
    }

    private final String name;
    private final int price;

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

enum Money {
    M500(500), M200(200), M100(100), M50(50), M10(10);

    Money(int denomination) {
        this.denomination = denomination;
    }
    private final int denomination;

    public int getDenomination() {
        return denomination;
    }

}
public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello! I'm alive Vending machine!!\n" +
                "Choose the beverage:\n" +
                "DobriyCola - 90 rub\n" +
                "Fanta - 85 rub\n" +
                "Sprite - 70 rub");
        String d = s.next();
        Drinks drink = Drinks.DOBRIYCOLA;
        switch (d) {
            case "DobriyCola":
                break;
            case "Fanta":
                drink = Drinks.FANTA;
                break;
            case "Sprite":
                drink = Drinks.SPRITE;
                break;
            default:
                System.out.println("This beverage does not exist!\n"+ "Goodbye!");
                System.exit(0);

        }
        System.out.println("!!!!!!!!!!Insert your money!!!!!!!!" + "(tell me when you finish inserting)");
        List <Money> customer_money = new ArrayList <Money>();
        while (s.hasNextInt()) {
            int n = Integer.parseInt(s.next());
            switch (n) {
                case 10:
                    customer_money.add(Money.M10);
                    break;
                case 50:
                    customer_money.add(Money.M50);
                    break;
                case 100:
                    customer_money.add(Money.M100);
                    break;
                case 200:
                    customer_money.add(Money.M200);
                    break;
                case 500:
                    customer_money.add(Money.M500);
                    break;
                default:
                    System.out.println("Wrong value");
            }


        }
        int sum = 0;
        for (Money m : customer_money) {
            sum += m.getDenomination();
        }
        if (sum < drink.getPrice()) {
            System.out.println("You're too poor for that..Sorry");
        } else if (sum > drink.getPrice()) {
            System.out.println("Take your " + drink.getName() + "\n" + "Your change:");
            int change = sum - drink.getPrice();
            while (change >= 10) {
                for (Money m:
                        Money.values()) {
                    if (change >= m.getDenomination()) {
                        System.out.println(m.getDenomination());
                        change -= m.getDenomination();
                    }
                }
            }
        }
    }
}
