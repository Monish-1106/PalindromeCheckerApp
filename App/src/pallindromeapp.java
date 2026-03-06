import java.util.*;

public class pallindromeapp {
    static void main() {
        String input = "Level";

        // Start time
        long startTime = System.nanoTime();

        boolean isPalindrome = checkPalindrome(input);

        // End time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    public static boolean checkPalindrome(String input) {

        String normalized = input.toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}