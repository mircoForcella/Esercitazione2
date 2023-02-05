package it.develhope.extramarco;

import it.develhope.extramarco.entities.Skill;
import it.develhope.extramarco.entities.Warrior;
import it.develhope.extramarco.entities.Wizard;

import java.util.ArrayList;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Skill fireQ = new Skill("Pillar Of Flame", 20, 60);
        Skill fireR = new Skill("Pyroclasm", 30, 120);
        Skill meleeQ = new Skill("Decimate", 100, 50);
        Skill meleeR = new Skill("Guillotine", 250, 150);

        ArrayList<Skill> dariusSkills = new ArrayList<>(Arrays.asList(meleeQ, meleeR));
        ArrayList<Skill> brandSkills = new ArrayList<>(Arrays.asList(fireQ, fireR));
        Warrior darius = new Warrior("Darius", 500, 240, dariusSkills, 40);
        Wizard brand = new Wizard("Brand", 300, 400, brandSkills, 5);

        darius.attack(brand,meleeQ);
        System.out.println("\n---------------");
        brand.attack(darius,fireQ);
        System.out.println();

        System.out.println("Darius is alive? " + darius.isAlive());
        System.out.println("Brand is alive? " + brand.isAlive());

    }
}
