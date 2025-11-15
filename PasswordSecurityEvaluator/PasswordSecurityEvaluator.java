import java.util.Scanner;

public class PasswordSecurityEvaluator {
    /**
     * 
     * @author Kraptukrait
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String password, securityStatus;
        int score = 0;

        System.out.print("Please enter your password for verification purposes: ");
        password = myScanner.nextLine();

        if (password.length() > 8) {
            score += 1;

            for (int b = 0; b < password.length(); b++) {
                if (!Character.isLetterOrDigit(password.charAt(b))) { // ! = For special characters
                    score += 1;
                    break;
                }
            }

            for (int c = 0; c < password.length(); c++) {
                if (Character.isUpperCase(password.charAt(c))) {
                    score += 1;
                    break;
                }
            }

            for (int d = 0; d < password.length(); d++) {
                if (Character.isLowerCase(password.charAt(d))) {
                    score += 1;
                    break;
                }
            }

            for (int e = 0; e < password.length(); e++) {
                if (Character.isDigit(password.charAt(e))) {
                    score += 1;
                    break;
                }
            }
        }
        if (score == 0) {
            securityStatus = "Very Weak";
        } else if (score == 1) {
            securityStatus = "Weak";
        } else if (score == 2) {
            securityStatus = "Moderate";
        } else if (score == 3) {
            securityStatus = "Strong ";
        } else {
            securityStatus = "Very Strong";
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++"
                + "\nEvaluation"
                + "\nYour input = " + password
                + "\nSafety rating (in points) = " + score
                + "\nClassification is up to you = " + securityStatus
                + "\n+++++++++++++++++++++++++++++++++++++++");
        myScanner.close();
    }
}
