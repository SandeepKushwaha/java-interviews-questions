package pattern;

public class PyramidPatterns {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Character Pyramid Pattern:");
        printCharacterPyramidPattern(number);
        System.out.println();
        printCharacterPyramidRowsPattern(number);
        System.out.println();
        printPatternPyramidRowNumber(number);
        System.out.println();
        printPatternPyramidColNumber(number);
        System.out.println();
        printPatternPyramidStarsNumber(number);
        System.out.println();
        printPatternPyramidReverseStarsNumbers(number);
        System.out.println();
        printPatternPyramidReverseRowNumbers(number);
        System.out.println();
        printPatternPyramidReverseColNumbers(number);
        System.out.println();
        printPatternsNumericalPyramidAscending(number);
        System.out.println();
        printPatternsNumericalPyramidAscendingDescending(number);
        System.out.println();

        scanner.close();
    }

    public static void printCharacterPyramidPattern(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void printCharacterPyramidRowsPattern(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + i - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void printPatternPyramidRowNumber(int rows) {
        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void printPatternPyramidColNumber(int rows) {
        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void printPatternPyramidStarsNumber(int rows) {
        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void printPatternPyramidReverseStarsNumbers(int rows) {
        for (int i = rows; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void printPatternPyramidReverseRowNumbers(int rows) {
        for (int i = rows; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void printPatternPyramidReverseColNumbers(int rows) {
        for (int i = rows; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void printPatternsNumericalPyramidAscending(int rows) {
        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void printPatternsNumericalPyramidAscendingDescending(int rows) {
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = i; j > 1; j--) {
                System.out.print("  ");
            }

            // Print ascending numbers
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }

            // Print descending numbers
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
