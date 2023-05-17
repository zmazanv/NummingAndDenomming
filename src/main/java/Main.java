import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void divider() {
        Scanner scanner = new Scanner(System.in);
        double quotient = 0;
        while (quotient == 0) {
            try {
                System.out.println("What number would you like to divide (numerator)?");
                double numerator = scanner.nextDouble();
                System.out.println("What number would you like to divide by (denominator)?");
                double denominator = scanner.nextDouble();
                if (denominator == 0) {
                    throw (new ArithmeticException("Dividing by zero."));
                }
                quotient = numerator / denominator;
                if ((quotient / Math.floor(quotient)) == 1) {
                    System.out.printf("The quotient is %.0f.%n", quotient);
                } else {
                    System.out.println("The quotient is: " + quotient + '.');
                }
            } catch (InputMismatchException e) {
                System.out.println("Number input is required to divide. Please try again with valid number input.");
                e.printStackTrace();
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("It is not possible to divide by zero. Please try again using a valid value.");
                e.printStackTrace();
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        divider();
    }

}
