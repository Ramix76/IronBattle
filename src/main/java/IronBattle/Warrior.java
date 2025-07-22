package IronBattle;

import java.util.Random;

import IronBattle.Character;
import IronBattle.Attacker;

public class Warrior extends Character implements Attacker {
    private int stamina;
    private int strength;

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        this.stamina = stamina;
        this.strength = strength;
    }

    private static int getRandom(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    @Override
    public String getStats() {
        return super.getName() + " [Type: Warrior, HP: " + super.getHp() + ", Stamina: " + stamina + ", Strength: " + strength + "]";
    }

    public int getStamina() { return stamina; }
    public int getStrength() { return strength; }

    public void setStamina(int stamina) { this.stamina = stamina; }
    public void setStrength(int strength) { this.strength = strength; }

    public void attack(Character opponent) {
        if (stamina >= 5 && Math.random() < 0.5) {
            // Heavy attack
            System.out.println(super.getName() + " does a HEAVY attack for " + strength + " damage!");
            opponent.setHp(opponent.getHp() - strength);
            stamina -= 5;
        } else if (stamina >= 1) {
            // Weak attack
            int damage = strength / 2;
            System.out.println(super.getName() + " does a WEAK attack for " + damage + " damage!");
            opponent.setHp(opponent.getHp() - damage);
            stamina += 1;
        } else {
            // No attack
            System.out.println(super.getName() + " is too tired and regains 2 stamina.");
            stamina += 2;
        }
    }

    @Override
    public String getType() {
        return "Warrior";
    }
}
