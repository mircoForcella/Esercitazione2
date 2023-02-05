package it.develhope.extramarco.entities;

import java.util.ArrayList;

public class Skill {
    private String name;
    private int damage;
    private int mana;

    public Skill(String name, int damage, int mana) {
        this.name = name;
        this.damage = damage;
        this.mana = mana;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage > 0) {
            this.damage = damage;
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (damage > 0) {
            this.mana = mana;
        }
    }
}

