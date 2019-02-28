import java.util.Scanner;

public class Calculator
{
    public static void main(String[]args) {

        double num1;
        double num2;
        double result = 0;
        int whichCalculation;
        int calculationDecision;

        java.util.Scanner input = new java.util.Scanner(System.in);
        do {

            System.out.println("Choose a task. Press 1 to add, 2 to subtract, 3 to multiply, and 4 to divide.");

            whichCalculation = input.nextInt();

            System.out.println("Please enter the first number: ");
            num1 = input.nextDouble();

            System.out.println("Please enter the second number: ");
            num2 = input.nextDouble();

            if (whichCalculation == 1) {
                result = num1 + num2;
            }

            if (whichCalculation == 2) {
                result = num1 - num2;
            }

            if (whichCalculation == 3) {
                result = num1 * num2;
            }

            if (whichCalculation == 4) {
                result = num1 / num2;
            }

            System.out.println("The answer is...");
            System.out.println(result);

            System.out.println("Do you want to perform another calculation? (Press 1 to continue, Press 2 or any key to stop calculator).");
            calculationDecision = input.nextInt();
        }
            while (calculationDecision == 1) ;

        System.out.println("Calculation has ended.");
        System.exit(0);
    }
}
