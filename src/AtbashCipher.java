import javax.swing.text.Utilities;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AtbashCipher {

    /*
    The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.

Create a function that takes a string and applies the Atbash cipher to it.

Examples
atbash("apple") ➞ "zkkov"

atbash("Hello world!") ➞ "Svool dliow!"

atbash("Christmas is the 25th of December") ➞ "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"
Notes
Capitalisation should be retained.
Non-alphabetic characters should not be altered.
*/
    public static void main(String[] args) {


        atbash("Vmxibkgrlm zmw wvxibkgrlm ziv rwvmgrxzo uli gsv Zgyzhs xrksvi.");


    }


    public static String atbash(String str) {

        String letters = "";
        for (int i = 'a'; i <= 'z'; i++) {
            letters = letters + Character.toString(i);
        }
        String[] orginRow = letters.split("");
        List<String> a = Arrays.asList(letters.split(""));
        Collections.reverse(a);
        String[] orginRowRevers = a.stream().toArray(String[]::new);
        String reverStr = "";



        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < orginRow.length ; j++) {


                if ((str.charAt(i) + "").equalsIgnoreCase(orginRow[j])) {

                    if (Character.isUpperCase(str.charAt(i))){
                        System.out.println("1");
                        reverStr = reverStr + (orginRowRevers[j]+"").toUpperCase();
                    }else {
                        reverStr = reverStr + (orginRowRevers[j]+"").toLowerCase();
                    }

                }

                if ((str.charAt(i) + "").equals(" ")){
                    reverStr=reverStr+" ";
                    break;
                }


                Matcher m =Pattern.compile("[^a-zA-Z]").matcher((str.charAt(i) + ""));

                if (m.find()){
                    reverStr=reverStr+str.charAt(i);
                    break;
                }



            }
        }





        System.out.println(Arrays.toString(orginRow));
        System.out.println(Arrays.toString(orginRowRevers));

        System.out.println(reverStr);

        return "a";
    }

}
