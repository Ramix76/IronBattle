package IronBattle;

import java.util.Random;

public class Warrior extends Character implements Attacker {
    private int stamina;
    private int strength;

    public Warrior(String name) {
        super(name, getRandom(100, 200));
        this.stamina = getRandom(10, 50);
        this.strength = getRandom(1, 10);
    }

    private static int getRandom(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    @Override
    public String getStats() {
        return getName() + " [Type: Warrior, HP: " + getHp() + ", Stamina: " + stamina + ", Strength: " + strength + "]";
    }

    public int getStamina() { return stamina; }
    public int getStrength() { return strength; }

    public void setStamina(int stamina) { this.stamina = stamina; }
    public void setStrength(int strength) { this.strength = strength; }

    @Override
    public void attack(Character opponent) {
        if (stamina >= 5 && Math.random() < 0.5) {
            // Heavy attack
            System.out.println(getName() + " does a HEAVY attack for " + strength + " damage!");
            opponent.setHp(opponent.getHp() - strength);
            stamina -= 5;
        } else if (stamina >= 1) {
            // Weak attack
            int damage = strength / 2;
            System.out.println(getName() + " does a WEAK attack for " + damage + " damage!");
            opponent.setHp(opponent.getHp() - damage);
            stamina += 1;
        } else {
            // No attack
            System.out.println(getName() + " is too tired and regains 2 stamina.");
            stamina += 2;
        }
    }

    @Override
    public String getType() {
        return "Warrior";
    }
}
