import java.util.*;

public class pallindromeapp {
    static void main() {
        String input = "level";

        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack based Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        // Create a stack
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}