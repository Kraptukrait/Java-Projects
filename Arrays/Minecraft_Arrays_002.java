
/**
 *
 * @author KraptuKrait
 */
public class Minecraft_Arrays_002 {

    public static void main(String[] args) {
        String[] nameInventory = {"Quartz block", "Spawnei", "Oak planks", "Diamond", "Scaffolding", "Raw beef", "Ladder", "Bamboo", "Iron grid"};

        //Declare and initialize arrays for the inventory
        int[] numberInventory_S1 = {51, 31, 18, 32, 19, 43, 34, 46, 49};
        int[] numberInventory_S2 = {1, 35, 12, 42, 9, 48, 44, 16, 29};
        int[] numbernventory_S3 = {12, 11, 22, 11, 19, 42, 34, 26, 32};

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

        changeArray("Raw beef", nameInventory, numberInventory_S1, statusInventory_S1, -5);
        changeArray("Spawnei", nameInventory, numberInventory_S1, statusInventory_S1, -3);
        changeArray("Bamboo", nameInventory, numberInventory_S1, statusInventory_S1, -20);
        changeArray("Diamond", nameInventory, numberInventory_S1, statusInventory_S1, -5);
        //Spieler 1 Ausgabe der Daten in der Konsole
        for (int i = 0; i < nameInventory.length; i++) {
            System.out.print("Name: " + nameInventory[i]);
            System.out.print(" Quantity: " + numberInventory_S1[i]);
            System.out.print(" Selected: " + statusInventory_S1[i] + "\n");
        }
    }

    public static void changeArray(String search, String[] inventoryname, int[] inventorynumber, boolean[] status, int aenderung) {
        for (int l = 0; l < inventoryname.length; l++) {
            if (inventoryname[l].equalsIgnoreCase(search)) {
                inventorynumber[l] = inventorynumber[l] + aenderung;
                status[l] = true;
            } else {
                status[l] = false;
            }
        }
    }
}
