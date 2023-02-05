package it.develhope.extramarco.entities;

import java.util.ArrayList;

public class Warrior extends Character{

    private int strenght;

    public Warrior(String name, int lifePoints, int manaPoints, ArrayList<Skill> skill, int strenght) {
        super(name, lifePoints, manaPoints, skill);
        this.strenght = strenght;
    }

    @Override
    public void attack(Character pg, Skill s) {
        if(getManaPoints() >= s.getMana()){
            System.out.println(getName());
            pg.setLifePoints(pg.getLifePoints() - (getStrenght() + s.getDamage()));
            System.out.println("Damage inflicted : " + (getStrenght() + s.getDamage()));
            System.out.printf("The enemy Health is now : %d", pg.getLifePoints());
        }else{
            System.out.print(getName());
            System.out.println(" Not enough Mana");
        }

    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }
}
