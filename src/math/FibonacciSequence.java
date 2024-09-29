package math;

public class FibonacciSequence {

    /**
     * Main method of the class for the following question:
     *   Print n terms a Fibonacci sequence using recursion.
     * */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        printFibonacciSequence(number);
        System.out.println();
        printFibonacci(number); // answer of this question
    }

    private static int fibonacci(int number) {
        if (number <= 1)
            return number;

        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    // Optimized:
    private static void printFibonacci(int number) {
        System.out.print("Fibonacci sequence of " + number + " numbers: ");

        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Brute Force:
    private static void printFibonacciSequence(int number) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 0; i < number; i++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}