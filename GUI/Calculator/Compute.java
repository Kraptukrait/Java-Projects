/**
 *
 * @author Kraptukrait
 */
public class Compute {
    private String input;
    private double result;

    public Compute(String calculatorInput){
        this.input = calculatorInput;
        calculate();
    }

    private void calculate() {
        try {
            // Remove spaces
            input = input.replaceAll("\\s", "");

            if(input.contains("+")) {
                String[] parts = input.split("\\+");
                result = Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
            } else if(input.contains("-")) {
                String[] parts = input.split("-");
                result = Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
            } else if(input.contains("*")) {
                String[] parts = input.split("\\*");
                result = Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
            } else if(input.contains("/")) {
                String[] parts = input.split("/");
                result = Double.parseDouble(parts[0]) / Double.parseDouble(parts[1]);
            } else {
                result = Double.parseDouble(input);
            }

        } catch (Exception e) {
            System.out.println("Invalid input: " + input);
            result = 0;
        }
    }

    public double getResult() {
        return result;
    }
}
