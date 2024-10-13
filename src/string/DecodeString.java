package string;

import java.util.Stack;

public class DecodeString {

    /**
     * Main method of the class for the following question: <br />
     *   Decode String of given string as following example: <br /><br />
     *   Example 1: <br />
     *   Input: "3[a]2[bc]" <br />
     *   Output: "aaabcbc" <br /> <br />
     *   Example 2: <br />
     *   Input: "3[a2[c]]" <br />
     *   Output: "accaccacc" <br />
     * */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter input Encoded string: ");
        String input = scanner.nextLine();
        System.out.println(decodeString(input));
        scanner.close();
    }

    private static String decodeString(String str) {
        // Stack is used to keep track of strings that are being built right before an opening bracket [ is encountered.
        Stack<String> strStack = new Stack<>();

        // stack is used to keep track of the counts (the numbers) that specify how many times the enclosed string should be repeated.
        Stack<Integer> countStack = new Stack<>();

        // StringBuilder is used to build and store the current string segment that we are constructing.
        StringBuilder currentString = new StringBuilder();
        int number = 0;

        for (char ch : str.toCharArray())
            if (Character.isDigit(ch)) {
                // Build the number (in case it's more than one digit)
                number = number * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current string and current number onto their respective stacks
                countStack.push(number);
                strStack.push(currentString.toString());
                // Reset for the next sequence
                currentString.setLength(0); // Clear the StringBuilder
                number = 0; // Reset number
            } else if (ch == ']') {
                // Pop the last string and count
                StringBuilder temp = new StringBuilder(strStack.pop());
                int repeatCount = countStack.pop();
                // Append current string to the popped string the specified number of times
                temp.append(String.valueOf(currentString).repeat(Math.max(0, repeatCount)));
                currentString = temp; // Update the current string
            } else {
                // It's a regular character
                currentString.append(ch);
            }

        return currentString.toString();
    }
}