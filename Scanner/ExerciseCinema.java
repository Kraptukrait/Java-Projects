
import java.util.Scanner;

/**
 *
 * @author KraptuKrait
 */
public class ExerciseCinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the series ...\n"
                + "The series is age-restricted. The minimum age is 16.");
        int mpa = 16;
        System.out.print("Please enter your age: ");
        int input = scanner.nextInt();
        if (input >= 16) {
            System.out.println("Enjoy watching, access granted.");
        } else {
            System.out.println("You are not 16, access denied.");
        }
        input -= mpa;
        System.out.println("The age difference is " + Math.abs(input) + " years \n"
                + "I wish you a nice day");
    }

}
