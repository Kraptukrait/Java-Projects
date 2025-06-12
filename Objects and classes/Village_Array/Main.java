package com.mycompany.Village;

/**
 *
 * @author KraptuKrait
 */
public class Main {

    public static void main(String[] args) {
        Village neverland;
        neverland = new Village("CuddleVillage", "Savanna", 108);

        neverland.setName("CuddleVillage");

        System.out.println("Village " + neverland.getName() + " " + neverland.getType() + " " + neverland.getSize());

        Creature[] creatures = new Creature[4];
        Creature muhilda = new Creature("muhilda", 4, "Cow");
        creatures[0] = muhilda;
        Creature mia = new Creature("mia", 2, "Human");
        creatures[1] = mia;
        Creature frederico = new Creature("frederico", 2, "Chicken");
        creatures[2] = frederico;
        Creature eggbert = new Creature("eggbert", 2, "Chicken");
        creatures[3] = eggbert;

        mia.setName("Amelie");
        
        System.out.println("Villager: ");
        for(int a=0; a<creatures.length; a++){
            System.out.println(creatures[a].getType() + " - " + creatures[a].getName() + " " + creatures[a].getNumberOfLegs());
        }
        
        Structure[] structures = new Structure[2];
        Structure fortress = new Structure("Fortress", 102);
        structures[0] = fortress;
        Structure woodenHouse = new Structure("Wooden House", 102);
        structures[1] = woodenHouse;
        
        for(int b=0; b<structures.length; b++){
            System.out.println("Structure " + structures[b].getMaterial() + " - " + structures[b].getNumber());
        }
    }
}
