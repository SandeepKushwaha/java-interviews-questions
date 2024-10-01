package math;

public class PrintPrimeNumbers {

    /**
     * Main method of the class for the following question:
     *   print all the prime numbers between 1 to n.
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        printPrimeNumbers(number);
    }

    private static void printPrimeNumbers(int number) {
        System.out.print("Prime numbers between 1 to " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}