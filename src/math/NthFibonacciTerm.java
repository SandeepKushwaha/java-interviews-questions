package math;

public class NthFibonacciTerm {

    /**
     * Main method of the class for the following question:
     *   Find the nth term of the Fibonacci series.
     * </br>
     * The sequence typically begins like this:
     *      0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.println("The " + number + " term of the Fibonacci series: " + nthFibonacciTerm(number));
    }

    private static int nthFibonacciTerm(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int c = 1;
            for (int i = 3; i <= number; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}