package IronBattle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== RPG Battle Simulator ===");

        System.out.print("Enter name for Character 1: ");
        String name1 = sc.nextLine();
        System.out.print("Is " + name1 + " a Warrior or Wizard? ");
        String type1 = sc.nextLine();

        Character c1 = type1.equalsIgnoreCase("Wizard") ? new Wizard(name1) : new Warrior(name1);

        System.out.print("Enter name for Character 2: ");
        String name2 = sc.nextLine();
        System.out.print("Is " + name2 + " a Warrior or Wizard? ");
        String type2 = sc.nextLine();

        Character c2 = type2.equalsIgnoreCase("Wizard") ? new Wizard(name2) : new Warrior(name2);

        BattleSimulator.fight(c1, c2);
    }
}
