import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static double divider() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What number would you like to divide (numerator)?");
            double numerator = scanner.nextInt();
            System.out.println("What number would you like to divide by (denominator)?");
            double denominator = scanner.nextInt();
            if (denominator == 0) {
                throw (new ArithmeticException("Dividing by zero."));
            }
            double quotient = numerator / denominator;
            if ((quotient / Math.floor(quotient)) == 1) {
                System.out.println("The quotient is " + (int)quotient + '.');
            } else {
                System.out.println("The quotient is: " + quotient + '.');
            }
            return quotient;
        } catch (InputMismatchException e) {
            System.out.println("Number input is required to divide. Please try again with valid number input.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("It is not possible to divide by zero. Please try again using a valid value.");
            e.printStackTrace();
        }
        return Double.NaN;
    }

    public static void main(String[] args) {
        divider();
    }
}
