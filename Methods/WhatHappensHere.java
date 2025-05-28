
/**
 *
 * @author KraptuKrait
 */
import java.util.Scanner;
public class WhatHappensHere {

    public static void main(String[] args) throws InterruptedException{
        int[] userNumber, calculatorNumber = new int[4];
        String inputLine;
        String[] inputParts;
        Scanner input = new Scanner(System.in);
        System.out.println("Attention, here come the numbers, please memorize them:\n");
        for (int i = 0; i < calculatorNumber.length; i++) {
            calculatorNumber[i] = (int) (Math.random() * 100);
            System.out.print(calculatorNumber[i] + " ");
        }
        Thread.sleep(5000);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n Now repeat the numbers separated by spaces. Enter with \"Enter\":");
        System.out.print("==> ");
        inputLine = input.nextLine();
        inputParts = inputLine.split(" ");
        userNumber = new int[inputParts.length];
        userNumber = stringArrayToInt(inputParts, userNumber);
        System.out.println("Calculator: ");
        arrayOutput(calculatorNumber);
        System.out.println("\n User:    ");
        arrayOutput(userNumber);
        // If-Anweisung
        if (arraysAreEqual(calculatorNumber, userNumber)) {
            System.out.println("\n BINGO!!!");
        } else {
            System.out.println("\n Pity...");
        }
    }

    // Mit-Methoden
    public static boolean arraysAreEqual(int[] array_1, int[] array_2) {
        if (array_1.length != array_2.length) {
            return false;
        }
        for (int i = 0; i < array_1.length; i++) {
            if (array_1[i] != array_2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void arrayOutput(int[] array_int) {
        for (int i = 0; i < array_int.length; i++) {
            System.out.print(array_int[i] + " ");
        }
    }

    public static int[] stringArrayToInt(String[] array_string, int[] array_int) {
        for (int i = 0; i < array_int.length; i++) {
            array_int[i] = Integer.parseInt(array_string[i]);
        }
        return array_int;
    }
}
