package it.develhope.extramarco.entities;

import java.util.ArrayList;

public abstract class Character {
    private String name;
    private int lifePoints;
    private int manaPoints;
    ArrayList<Skill> skill = new ArrayList<>();

    public Character(String name, int lifePoints, int manaPoints, ArrayList<Skill> skill) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.manaPoints = manaPoints;
        this.skill = skill;
    }

    public void addSkill(Skill s){
        skill.add(s);
    }

    public Skill getSkill(int i){
      return getSkill().get(i);
    }

    public boolean isAlive(){
        if(getLifePoints() > 0){
            return true;
        }else{
            return false;
        }
    }

    public abstract void attack(Character pg, Skill s);


    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public ArrayList<Skill> getSkill() {
        return skill;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }
}
