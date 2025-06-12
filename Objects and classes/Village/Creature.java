package com.mycompany.Village;

/**
 *
 * @author KraptuKrait
 */
public class Creature {

    private String name;
    private int numberOfLegs;
    private String type;

    public Creature(String creatureName, int numberOfLegs, String creatureType) {
        this.name = creatureName;
        this.numberOfLegs = numberOfLegs;
        this.type = creatureType;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getType() {
        return type;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setNumberOfLegs(int newNumberOfLegs) {
        this.numberOfLegs = newNumberOfLegs;
    }

    public void setType(String newType) {
        this.type = newType;
    }
}
