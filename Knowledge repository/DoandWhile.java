
/**
 *
 * @author KraptuKrait
 */

public class DoandWhile {
public static void main(String[] args) {
        int counter = 90;
        do {
            System.out.println(counter + " minutes to the end.");
            counter = counter - 1;
            if (counter < 3) {
                System.out.println("Pack your things, you're about to go home. :-(");
            }
        } while (counter > 0);
    }
}
