import java.util.Stack;

public class pallindromeapp {
    static void main() {
        String input = "noon";

        System.out.println("Input : " + input);

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}