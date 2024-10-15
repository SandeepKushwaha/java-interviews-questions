package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    /**
     * Main method of the class for the following question:
     *   Check if the parenthesis string is valid or not. <br />
     *   <strong>Example 1:</strong> <br />
     *     Input: ()[]{} <br />
     *     Output: true <br />
     *
     *   <strong>Example 2:</strong> <br />
     *     Input: ([{}]) <br />
     *     Output: true <br />
     *
     *   <strong>Example 3:</strong> <br />
     *     Input: ( <br />
     *     Output: false <br />
     *
     * */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter Parenthesis string: ");

        String str = scanner.nextLine();
        System.out.println(isValidParenthesis(str));
        System.out.println(isValidParenthesisWithHashMap(str));

        scanner.close();
    }

    /**
     * Method to check if the parenthesis string is valid or not. (brute force)
     * */
    public static boolean isValidParenthesis(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        if (str.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * Method to check if the parenthesis string is valid or not. (using HashMap)
     * */
    public static boolean isValidParenthesisWithHashMap(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        if (str.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                if (stack.isEmpty() || map.get(c) != stack.pop()) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}