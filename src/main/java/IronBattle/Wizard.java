package IronBattle;

import java.util.Random;

public class Wizard extends Character implements Attacker {
    private int mana;
    private int intelligence;

    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    private static int getRandom(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public String getStats() {
        return getName() + " the Wizard [Mana: " + mana + ", Intelligence: " + intelligence + "]";
    }

    public int getMana() { return mana; }
    public int getIntelligence() { return intelligence; }

    public void setMana(int mana) { this.mana = mana; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }

    @Override
    public void attack(Character opponent) {
        if (mana >= 5 && Math.random() < 0.5) {
            // Fireball
            System.out.println(getName() + " casts FIREBALL for " + intelligence + " damage!");
            opponent.setHp(opponent.getHp() - intelligence);
            mana -= 5;
        } else if (mana >= 1) {
            // Staff hit
            System.out.println(getName() + " attacks with STAFF for 2 damage!");
            opponent.setHp(opponent.getHp() - 2);
            mana += 1;
        } else {
            // No attack
            System.out.println(getName() + " is out of mana and regains 2.");
            mana += 2;
        }
    }

    @Override
    public String getType() {
        return "Wizard";
    }
}

