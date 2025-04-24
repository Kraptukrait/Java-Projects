
import java.util.Scanner;

/**
 *
 * @author KraptuKrait
 */
public class CountingLetters {

    public static void main(String[] args) {
        String inputWord;
        char inputChar;
        int counter = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        inputWord = myScanner.nextLine();
        System.out.print("Please enter a letter to be counted in the word: ");
        inputChar = myScanner.next().charAt(0);
        for (int i = 0; i < inputWord.length(); i++) {
            if (inputWord.charAt(i) == inputChar) {
                counter++;
            }
        }
        System.out.println("The letter '" + inputChar + "' comes " + counter + " times before.");
    }
}
