package com.mycompany.Village;

/**
 *
 * @author KraptuKrait
 */
public class Main {

    public static void main(String[] args) {
        Village Neverland;
        Neverland = new Village("Neverland", "Savanna");
        Neverland.setName("CuddleVillage");
        System.out.println("Village " + Neverland.getName() + " " + Neverland.getType());

        Creature muhilda, frederico, eggbert, mia;
        mia = new Creature("mia", 2, "Human");
        muhilda = new Creature("muhilda", 4, "Cow");
        frederico = new Creature("frederico", 2, "Chicken");
        eggbert = new Creature("eggbert", 2, "Chicken");

        mia.setName("Amelie");
        System.out.println("Villager: " + mia.getName() + " Number of legs: " + mia.getNumberOfLegs());
        System.out.println(muhilda.getType() + " - " + muhilda.getName() + " " + muhilda.getNumberOfLegs());
        System.out.println(frederico.getType() + " - " + frederico.getName() + " " + frederico.getNumberOfLegs());
        System.out.println(eggbert.getType() + " - " + eggbert.getName() + " " + eggbert.getNumberOfLegs());

        Structure structure;
        structure = new Structure("Fortress", 102);
        System.out.println("Structure " + structure.getMaterial() + " - " + structure.getNumber());
    }

}
