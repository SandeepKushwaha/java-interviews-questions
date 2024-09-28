package math;

public class PrimeNumber {
    /**
     * Main method of the class for the following question:
     *   Check if the given number as a prime number.
     * */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Is Prime " + number + "? : " + isPrime(number));
    }

    private static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
