public class Palindrome_Word {


    /*Create a recursive function that determines whether a word is a palindrome or not.

Examples
isPalindrome("madam") ➞ true

isPalindrome("adieu") ➞ false

isPalindrome("rotor") ➞ true
Notes
All inputs are in lowercase.
You are expected to solve this challenge via recursion.
You can check on the Resources tab for more details about recursion in Java.
If you think recursion is fun, a collection of those challenges can be found in here.
*/


    public static void main(String[] args) {
        isPalindrome("adieu");
    }


    public static void isPalindrome(String word) {

        // gungor

        String dummy="";

        for (int i = word.length()-1; i >= 0 ; i--) {
            dummy=dummy+word.charAt(i)+"";
        }

        boolean assertWords= word.equals(dummy);

        System.out.println("assertWords = " + assertWords);

    }






}
//        StringBuilder reversStr = new StringBuilder(word);
//        reversStr.reverse();
//
//        boolean assertWord = word.equals(reversStr.toString());
//
//        System.out.println(assertWord);
//
//        System.out.println("reversStr = " + reversStr);
//
//        System.out.println("word = " + word);
