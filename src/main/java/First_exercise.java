import java.util.Scanner;

/**
 * Simple calculator
 * @author SNesterov
 * @version 0.2
 */

public class First_exercise {

    /**
     * main function of program
     * @param args input parameters
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose action (1 - simpleCalculator, 2 - The longest word in array):");
        int action = inputInt(scanner);
            switch (action) {
                case 1:
                    simpleCalculator(scanner);
                    break;
                case 2:
                    longestWordInArray(scanner);
                    break;
                default:
                    System.out.println("You have chosen the wrong action");
            }
        scanner.close();
    }

    /**
     * an array of words is set and the longest is found
     * @param scanner Scanner for reading input data
     */
    private static void longestWordInArray(Scanner scanner) {
        System.out.println("Enter count words in array");
        int lenghtWordsArray = inputInt(scanner);
        if (lenghtWordsArray <= 0) {
            System.out.println("You have entered incorrect lenght of array");
        } else {
            String[] words = new String[lenghtWordsArray];
            for (int i = 0; i < lenghtWordsArray; i++) {
                System.out.println("Enter the word: ");
                words[i] = scanner.next();
            }
            String longestWord = longestWord(words);
            System.out.printf("The longest word in array is : %s \n", longestWord);
        }
    }

    /**
     * the function finds the longest word in the given array
     * @param words array of words
     * @return the longest word in the array
     */
    private static String longestWord(String[] words) {
        String longesWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longesWord.length()) {
                longesWord = words[i];
            }
        }
        return longesWord;
    }

    /**
     * enter the operation and get the result
     * @param scanner Scanner for reading input data
     */
    private static void simpleCalculator(Scanner scanner) {
        System.out.println("Choose operation (1 - add, 2 - sub, 3 - div, 4 - mult):");
        int operation = inputInt(scanner);

        if ((operation < 1) || (operation > 4)) {
            System.out.println("You have chosen the wrong operation");
        } else {
            System.out.println("Enter first number:");
            float firstComponent = inputFloat(scanner);

            System.out.println("Enter second number:");
            float secondComponent = inputFloat(scanner);

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
    }

    /**
     * check the entered string for correspond to the float type
     * @param scanner Scanner for reading input data
     * @return correct float
     */
    private static float inputFloat(Scanner scanner) {
        float entered;
        while (!scanner.hasNextFloat()) {
            System.out.println(scanner.next() + " isn't float, try again!");
        }
        entered = scanner.nextFloat();

        return entered;
    }

    /**
     * check the entered string for correspond to the float type
     * @param scanner Scanner for reading input data
     * @return correct integer
     */
    private static int inputInt(Scanner scanner) {
        int entered;
        while (!scanner.hasNextInt()) {
            System.out.println(scanner.next() + " isn't integer, try again!");
        }
        entered = scanner.nextInt();

        return entered;
    }

    /**
     * subtraction operation
     * @param a first argument of statement
     * @param b second argument of statement
     * @return subtraction a and b
     */
    private static float sub(float a, float b) {
        return a - b;
    }

    /**
     * addition operation
     * @param a first argument of statement
     * @param b second argument of statement
     * @return addition a and b
     */
    private static float add(float a, float b) {
        return a + b;
    }

    /**
     * division operation
     * @param a first argument of statement
     * @param b second argument of statement
     * @return division a and b
     */
    private static float div(float a, float b) {
        return a / b;
    }

    /**
     * multiplication operation
     * @param a first argument of statement
     * @param b second argument of statement
     * @return multiplication a and b
     */
    private static float mult(float a, float b) {
        return a * b;
    }
}
