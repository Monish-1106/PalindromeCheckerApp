public class pallindromeapp {
    static void main() {
        String word = "monish";
        System.out.println("Input text: " + word);
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
           }
        boolean isPalindrome = word.equals(reversed);
        if(isPalindrome){
            System.out.println(reversed + "\nis a palimdrome\n");
        }else{
            System.out.println(reversed + "\nis not a palimdrome\n");
        }

    }
}
