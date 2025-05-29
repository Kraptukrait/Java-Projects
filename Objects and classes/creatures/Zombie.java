package com.mycompany.creatures;

/**
 *
 * @author KraptuKrait
 */
public class Zombie {

    boolean inChase;
    private String name;

    public Zombie(String zombieName, boolean state) {
        this.name = zombieName;
        this.inChase = state;
    }

    public void startChase() {
        inChase = true;
    }

    public void endChase() {
        inChase = false;
    }

    public String getName() {
        return name;
    }
}
