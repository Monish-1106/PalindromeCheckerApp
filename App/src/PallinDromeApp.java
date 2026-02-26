public class PallinDromeApp {
    static void main() {
       String word = "madam";
       int i,n;
       boolean isPalindrome = true;
       n = word.length() - 1;
       for (i = 0; i < word.length()/2; i++) {
           if (word.charAt(i) != word.charAt(n-i)){
               isPalindrome=false;
               break;
           }
       }
       if(isPalindrome){
           System.out.println("Is it a Palindrome? : true");
       }else{
           System.out.println("IS it a Palindrome? : false");
       }

    }
}
