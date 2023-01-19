public class Palindrome {


    public static void main(String[] args) {


        String word = "ensar";

        String dummy = ""; //ra

        for (int i = word.length() - 1; i >= 0; i--) {
            dummy = dummy + word.charAt(i);

        }

        boolean result = false;

        if (word.equals(dummy)) {
            result = true;
        } else {
            result = false;
        }

        System.out.println(result);

    }


}
