package com.mycompany.Village;

/**
 *
 * @author KraptuKrait
 */
public class Structure {

    private String material;
    private int number;

    public Structure(String structureMaterial, int structureNumber) {
        this.material = structureMaterial;
        this.number = structureNumber;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumber() {
        // number++;
        return number;
    }

    public void setMaterial(String newMaterial) {
        this.material = newMaterial;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

}
