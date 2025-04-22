
import java.util.Scanner;

/**
 *
 * @author KraptuKrait
 */
public class ChipMachine01 {

    public static void main(String[] args) throws InterruptedException {
        Scanner myscanner = new Scanner(System.in);
        int price = 180, input;
        System.out.println("A bag of chips costs 1.80€ \n"
                + "(Attention, only 10, 20, and 50 cent coins are accepted!)\n"
                + "CHANGE NOT POSSIBLE)");
        Thread.sleep(1000);
        System.out.println("Please insert your coins!");

        while (price > 0) {
            input = myscanner.nextInt();
            if (input == 10 || input == 20 || input == 50) {
                price -= input;
                System.out.println("Amount still to pay: " + price);
            } else {
                System.out.println("Incorrect input");
                System.exit(0);
            }

        }

        System.out.println("You have paid.");
    }

}
