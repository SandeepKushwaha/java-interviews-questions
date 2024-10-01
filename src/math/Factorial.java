package math;

public class Factorial {

    /**
     * Main method of the class for the following question:
     *   Find the factorial of a number.
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Factorial of " + number + " is: " + factorial(number));
        System.out.println("Factorial of " + number + " is: " + factorialLoop(number));
    }

    /**
     * Calculates the factorial of a given number using recursion.
     *
     * @param  number  the number to calculate the factorial for
     * @return         the factorial of the given number
     */
    private static int factorial(int number) {
        if (number == 0)
            return 1;
        return number * factorial(number - 1);
    }

    /**
     * Calculates the factorial of a given number using loop.
     *
     * @param  number  the number to calculate the factorial for
     * @return         the factorial of the given number
     */
    private static int factorialLoop(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }


}
