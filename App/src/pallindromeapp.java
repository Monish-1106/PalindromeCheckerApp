import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class pallindromeapp {
    static void main() {
        String input = "civic";

        System.out.println("Input : " + input);

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;

        while ( !stack.isEmpty()) {
            if ( !stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}