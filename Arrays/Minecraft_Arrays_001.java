
/**
 *
 * @author KraptuKrait
 */
public class Minecraft_Arrays_001 {

    public static void main(String[] args) {
        String[] nameInventory = {"Quartz block", "Spawnei", "Oak planks", "Diamond", "Scaffolding", "Raw beef", "Ladder", "Bamboo", "Iron grid"};

        //Arrays für das Inventory deklarieren und initialisieren
        int[] anzahlInventory_S1 = {51, 31, 18, 32, 19, 43, 34, 46, 49};
        int[] anzahlInventory_S2 = {1, 35, 12, 42, 9, 48, 44, 16, 29};
        int[] anzahlnventory_S3 = {12, 11, 22, 11, 19, 42, 34, 26, 32};

        boolean[] statusInventory_S1 = new boolean[9];
        boolean[] statusInventory_S2 = new boolean[9];
        boolean[] statusInventory_S3 = new boolean[9];

        statusInventory_S1[7] = true;
        statusInventory_S2[2] = true;
        statusInventory_S3[4] = true;

        /* 
        ------------------------------Task------------------------------
        Change the arrays according to the following instructions and output the arrays again after each change:
        Player 1 roasts steaks from 5 times raw beef
        Player 2 uses 3 of his spawn eggs
        Player 3 builds a raft from 20 bamboo sticks
        Player 2 exchanges 5 of his diamonds for 20 oak planks from player 3
         */
        // ------------Sample issues and changes-------------
        System.out.println("------------Sample issues and changes-------------");

        for (int i = 0; i < nameInventory.length; i++) {
            System.out.print("Name: " + nameInventory[i]);
            System.out.print(" Quantity: " + anzahlInventory_S1[i]);
            System.out.print(" Selected: " + statusInventory_S1[i] + "\n");
        }

        //Player 1
        System.out.println("------------Task 1-------------");
        String search = "Raw beef";

        for (int j = 0; j < nameInventory.length; j++) {
            if (nameInventory[j].equalsIgnoreCase(search)) {
                anzahlInventory_S1[j] = anzahlInventory_S1[j] - 5;
                statusInventory_S1[j] = true;
            } else {
                statusInventory_S1[j] = false;
            }
            System.out.print("Name: " + nameInventory[j]);
            System.out.print(" Quantity: " + anzahlInventory_S1[j]);
            System.out.print(" Selected: " + statusInventory_S1[j] + "\n");
        }

        //Player 2
        System.out.println("------------Task 2-------------");
        search = "Spawnei";

        for (int k = 0; k < nameInventory.length; k++) {
            if (nameInventory[k].equalsIgnoreCase(search)) {
                anzahlInventory_S1[k] = anzahlInventory_S1[k] - 3;
                statusInventory_S1[k] = true;
            } else {
                statusInventory_S1[k] = false;
            }
            System.out.print("Name: " + nameInventory[k]);
            System.out.print(" Quantity: " + anzahlInventory_S1[k]);
            System.out.print(" Selected: " + statusInventory_S1[k] + "\n");
        }

        // Player 3
        System.out.println("------------Task 3-------------");
        search = "Bamboo";

        for (int a = 0; a < nameInventory.length; a++) {
            if (nameInventory[a].equalsIgnoreCase(search)) {
                anzahlInventory_S1[a] = anzahlInventory_S1[a] - 20;
                statusInventory_S1[a] = true;
            } else {
                statusInventory_S1[a] = false;
            }
            System.out.print("Name: " + nameInventory[a]);
            System.out.print(" Quantity: " + anzahlInventory_S1[a]);
            System.out.print(" Selected: " + statusInventory_S1[a] + "\n");
        }

        //Player 4
        System.out.println("------------Task 4-------------");
        search = "Diamond";

        for (int b = 0; b < nameInventory.length; b++) {
            if (nameInventory[b].equalsIgnoreCase(search)) {
                anzahlInventory_S1[b] = anzahlInventory_S1[b] - 5;
                statusInventory_S1[b] = true;
            } else {
                statusInventory_S1[b] = false;
            }
            System.out.print("Name: " + nameInventory[b]);
            System.out.print(" Quantity: " + anzahlInventory_S1[b]);
            System.out.print(" Selected: " + statusInventory_S1[b] + "\n");
        }
    }
}
