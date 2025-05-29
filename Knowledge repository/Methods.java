import java.util.Scanner;

/**
 *
 * @author KraptuKrait
 */
public class Methods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double newStorage = 0;
        double freeStorageConsole = 250.5;
        boolean fits;

        System.out.print("Please enter your name: ");
        String name = input.next();
        System.out.print("Please enter your data size: ");
        double inputSize = input.nextDouble();

        fits = checkStorageSpace(freeStorageConsole, inputSize);

        if (fits) {
            inputSize = freeStorageConsole;
            System.out.println("For the player: " + name + " the storage is large enough");
        } else {
            System.out.println("For the player: " + name + " the storage is not large enough");
        }
    }

    public static boolean checkStorageSpace(double freeStorageConsole, double gameSize) {
        if (freeStorageConsole >= gameSize) {
            return true;
        } else {
            return false;
        }
    }
}
