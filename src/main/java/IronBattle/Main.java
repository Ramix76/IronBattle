package IronBattle;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Random random = new Random();

    public static int getRandom(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== RPG Battle Simulator ===");

        System.out.print("Enter name for Character 1: ");
        String name1 = sc.nextLine();

        int choice1 = 0;
        while (choice1 != 1 && choice1 != 2) {
            System.out.print("Select class for " + name1 + ": (1) Warrior, (2) Wizard: ");
            if (sc.hasNextInt()) {
                choice1 = sc.nextInt();
                sc.nextLine();
                if (choice1 != 1 && choice1 != 2) {
                    System.out.println("Invalid choice, please enter 1 or 2.");
                }
            } else {
                System.out.println("Please enter a number (1 or 2).");
                sc.nextLine();
            }
        }

        Character c1;
        if (choice1 == 1) {
            int hp = getRandom(100, 200);
            int stamina = getRandom(10, 50);
            int strength = getRandom(1, 10);
            c1 = new Warrior(name1, hp, stamina, strength);
        } else {
            int hp = getRandom(50, 100);
            int mana = getRandom(10, 50);
            int intelligence = getRandom(1, 50);
            c1 = new Wizard(name1, hp, mana, intelligence);
        }

        System.out.print("Enter name for Character 2: ");
        String name2 = sc.nextLine();

        int choice2 = 0;
        while (choice2 != 1 && choice2 != 2) {
            System.out.print("Select class for " + name2 + ": (1) Warrior, (2) Wizard: ");
            if (sc.hasNextInt()) {
                choice2 = sc.nextInt();
                sc.nextLine();
                if (choice2 != 1 && choice2 != 2) {
                    System.out.println("Invalid choice, please enter 1 or 2.");
                }
            } else {
                System.out.println("Please enter a number (1 or 2).");
                sc.nextLine();
            }
        }

        Character c2;
        if (choice2 == 1) {
            int hp = getRandom(100, 200);
            int stamina = getRandom(10, 50);
            int strength = getRandom(1, 10);
            c2 = new Warrior(name2, hp, stamina, strength);
        } else {
            int hp = getRandom(50, 100);
            int mana = getRandom(10, 50);
            int intelligence = getRandom(1, 50);
            c2 = new Wizard(name2, hp, mana, intelligence);
        }

        System.out.println("\n--- Initial Stats ---");
        System.out.println("Character 1: " + c1.getStats());
        System.out.println("Character 2: " + c2.getStats());

        System.out.println("\nStarting battle...");
        BattleSimulator.fight(c1, c2);
    }
}
