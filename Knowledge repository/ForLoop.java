
/**
 *
 * @author KraptuKrait
 */
public class ForLoop {

    public static void main(String[] args) {
        // Declared and initialized a double array.
        double[] decimalNumbers = {1.2, 12.5, 7.6, 23.1, 2.9, 20.4};
        // Declared and initialized a double variable 'max'.
        double max = decimalNumbers[0];
        // Created a for loop to properly iterate through the array.
        for (int i = 0; i < decimalNumbers.length; i++) {
            // Created an if-statement: decimalNumbers[i] should be greater than max.
            if (decimalNumbers[i] > max) {
                // Assign decimalNumbers[i] to the variable max.
                max = decimalNumbers[i];
            }
        }
        // Output the value of the variable max.
        System.out.println("The largest number is: " + max);
    }

}
