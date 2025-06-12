package com.mycompany.Village;

/**
 *
 * @author KraptuKrait
 */
public class Village {

    private String name;
    private String type;

    public Village(String villageName, String villageType) {
        this.name = villageName;
        this.type = villageType;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setType(String newType) {
        this.type = newType;
    }

}
