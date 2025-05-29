package com.mycompany.creatures;

import java.util.Scanner;

/**
 *
 * @author KraptuKrait
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zombie kitter, spitter;

        kitter = new Zombie("Kitter", false);
        spitter = new Zombie("Spitter", true);

        kitter.startChase();

        System.out.println("One of the zombies is named " + kitter.getName() + ",");
        System.out.println("the other is named " + spitter.getName() + ".");

        kitter.endChase();
        System.out.println("The first zombie Kitter is being chased: " + kitter.inChase);
        System.out.println("The second zombie Spitter is being chased: " + spitter.inChase);

        Villager paul, mia;

        System.out.print("Please enter the health points for the first player: ");
        int input1 = input.nextInt();
        System.out.print("Please enter the health points for the second player: ");
        int input2 = input.nextInt();

        paul = new Villager("Paul", "butcher");
        mia = new Villager("Mia", "baker");

        paul.setHealth(input1, input2);

        System.out.println("The first villager is named: " + paul.getName() + " | Profession: " + paul.getProfession() + " | Health: " + paul.getHealth());
        System.out.println("The second villager is named: " + mia.getName() + " | Profession: " + mia.getProfession() + " | Health: " + mia.getHealth());

    }

}
