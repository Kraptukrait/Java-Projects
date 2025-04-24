
import java.util.Scanner;

/**
 *
 * @author KraptuKrait
 */
public class reversedWords {

    public static void main(String[] args) {
        String inputWord;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        inputWord = myScanner.nextLine();
        System.out.print("The reversed word is: ");
        for (int i = inputWord.length() - 1; i >= 0; i--) {
            System.out.print(inputWord.charAt(i));
        }
    }
}
