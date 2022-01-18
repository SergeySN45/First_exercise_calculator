import java.util.Scanner;

/**
 * Simple calculator
 * @author SNesterov
 */

public class First_exercise {

    /**
     * main function of program
     * @param args input parameters
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose operation (1 - add, 2 - sub, 3 - div, 4 - mult):");
        int operation = scanner.nextInt();

        if ((operation < 1) || (operation > 4)) {
            System.out.println("You have chosen the wrong operation");
        } else {
            System.out.println("Enter first number:");
            float firstComponent = scanner.nextFloat();

            System.out.println("Enter second number:");
            float secondComponent = scanner.nextFloat();

            switch (operation) {
                case 1:
                    System.out.print("The result of addition is ");
                    System.out.printf("%.4f", add(firstComponent, secondComponent));
                    break;
                case 2:
                    System.out.print("The result of subtraction is ");
                    System.out.printf("%.4f", sub(firstComponent, secondComponent));
                    break;
                case 3:
                    System.out.print("The result of division is ");
                    System.out.printf("%.4f", div(firstComponent, secondComponent));
                    break;
                case 4:
                    System.out.print("The result of multiplication is ");
                    System.out.printf("%.4f", mult(firstComponent, secondComponent));
                    break;
            }
        }

        scanner.close();
    }

    /**
     *
     * @param a first argument of statement
     * @param b second argument of statement
     * @return subtraction a and b
     */
    private static float sub(float a, float b) {
        return a - b;
    }

    /**
     *
     * @param a first argument of statement
     * @param b second argument of statement
     * @return addition a and b
     */
    private static float add(float a, float b) {
        return a + b;
    }

    /**
     *
     * @param a first argument of statement
     * @param b second argument of statement
     * @return division a and b
     */
    private static float div(float a, float b) {
        return a / b;
    }

    /**
     *
     * @param a first argument of statement
     * @param b second argument of statement
     * @return multiplication a and b
     */
    private static float mult(float a, float b) {
        return a * b;
    }
}
