import java.util.Scanner;
import javax.swing.*;
public class Knight {
    public static void main(String[] args) {
        String name;
        int health, age, gold, battles;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your knight's full name: ");
        name = input.nextLine();

        System.out.print("Enter your knight's initial health: ");
        health = input.nextInt();

        System.out.print("Enter your knight's age: ");
        age = input.nextInt();

        System.out.print("Enter your knight's initial gold: ");
        gold = input.nextInt();

        System.out.print("Enter your knight's battles: ");
        battles = input.nextInt();

        float avg_gold_per_battle = (float) gold / battles;

        System.out.printf("+-[ %s ]------------------------------------------------+%n" +
                        " | Health  : %d%n" +
                        " | Age     : %d%n" +
                        " | Battles : %d%n" +
                        " | Gold    : %d  (Avg. Gold per Battle : %.2f)%n" +
                        "+-------------------------------------------------+",
                name, health, age, battles, gold, avg_gold_per_battle);

        input.close();
    }
}
