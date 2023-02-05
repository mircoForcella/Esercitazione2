package it.develhope.extramarco.entities;

import java.util.ArrayList;

public class Wizard extends Character {
    private int abilityPower;

    public Wizard(String name, int lifePoints, int manaPoints, ArrayList<Skill> skill, int abilityPower) {
        super(name, lifePoints, manaPoints, skill);
        this.abilityPower = abilityPower;
    }

    @Override
    public void attack(Character pg, Skill s) {
        if(pg.getManaPoints() >= s.getMana()){
            System.out.println(getName());
            pg.setLifePoints(pg.getLifePoints() - (s.getDamage() * getAbilityPower()));
            System.out.println("Damage inflicted : " + (s.getDamage() * getAbilityPower()));
            System.out.printf("The enemy Health is now : %d", pg.getLifePoints());
        }else{
            System.out.print(getName());
            System.out.println(" Not enough Mana");
        }

    }

    public int getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        this.abilityPower = abilityPower;
    }
}
