
/**
 *
 * @author KraptuKrait
 */
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        System.out.print("enter first number: ");
        number1 = input.nextInt();

        System.out.print("enter second number: ");

        number2 = input.nextInt();
        plusInvoice(number1, number2);
        minusInvoice(number1, number2);
        malCalculation(number1, number2);
        sharedInvoice(number1, number2);
        moduleInvoice(number1, number2);

    }

    public static void plusInvoice(int number1, int number2) {
        int resultPlus = number1 + number2;
        System.out.println("=> " + number1 + " + " + number2 + " = " + resultPlus);
    }

    public static void minusInvoice(int number1, int number2) {
        int resultMinus = number1 - number2;
        System.out.println("=> " + number1 + " - " + number2 + " = " + resultMinus);
    }

    public static void malCalculation(int number1, int number2) {
        int rsesultMal = number1 * number2;
        System.out.println("=> " + number1 + " * " + number2 + " = " + rsesultMal);
    }

    public static void sharedInvoice(int number1, int number2) {
        int splitResult = number1 / number2;
        System.out.println("=> " + number1 + " / " + number2 + " = " + splitResult);
    }

    public static void moduleInvoice(int number1, int number2) {
        int resultModulo = number1 % number2;
        System.out.println("=> " + number1 + " % " + number2 + " = " + resultModulo);
    }

}
