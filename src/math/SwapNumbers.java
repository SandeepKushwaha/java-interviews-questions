package math;

public class SwapNumbers {
    /**
     * Main method of the class for the following question:
     *   How do you swap two numbers without using a third variable in Java?
     * */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a: " + a + ", b: " + b);

        // swap numbers
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a + ", b: " + b);
    }
}
