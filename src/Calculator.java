import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What Operation? (+, -, *, /): ");
        String operation = scanner.next();

        System.out.print("What is the first number?");
        double firstnumber = scanner.nextDouble();

        System.out.print("What is the second number?");
        double secondnumber = scanner.nextDouble();



    }
}
