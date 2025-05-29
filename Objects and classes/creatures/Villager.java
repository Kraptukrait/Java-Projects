package com.mycompany.creatures;

/**
 *
 * @author KraptuKrait
 */
public class Villager {

    private String name;
    private String profession;
    int health;

    public Villager(String villagerName, String occupation) {
        this.name = villagerName;
        this.health = 20;
        this.profession = occupation;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public void setHealth(int input1, int input2) {
        health = health - input1;
        health = health - input2;
    }

    public int getHealth() {
        return health;
    }
}
