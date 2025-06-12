package com.mycompany.Village;

/**
 *
 * @author KraptuKrait
 */
public class Village {

    private String name;
    private String type;
    private int size;
    Creature[] villageCreatures;
    Structure[] villageStructures;

    // Constructor
    public Village(String villageName, String villageType, int villageSize) {
        this.name = villageName;
        this.type = villageType;
        this.size = villageSize;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for type
    public String getType() {
        return type;
    }

    // Getter method for size
    public int getSize() {
        return size;
    }

    // Method to change the name
    public void setName(String newName) {
        this.name = newName;
    }

    // Method to change the type
    public void setType(String newType) {
        this.type = newType;
    }

}
