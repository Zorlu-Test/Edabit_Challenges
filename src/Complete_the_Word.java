import java.util.Arrays;
import java.util.List;

public class Complete_the_Word {
    /*
    An input string can be completed if additional letters can be added and no letters need to be taken away to match the word. Furthermore, the order of the letters in the input string must be the same as the order of letters in the final word.

Create a function that, given an input string, determines if the word can be completed.

Examples
canComplete("butl", "beautiful") ➞ true
// We can add "ea" between "b" and "u", and "ifu" between "t" and "l".

canComplete("butlz", "beautiful") ➞ false
// "z" does not exist in the word beautiful.

canComplete("tulb", "beautiful") ➞ false
// Although "t", "u", "l" and "b" all exist in "beautiful", they are incorrectly ordered.

canComplete("bbutl", "beautiful") ➞ false
// Too many "b"s, beautiful has only 1.
Notes
Both string input and word will be lowercased.

https://edabit.com/challenge/t9S9nNr79pLqjXgqb
    * */

    public static void main(String[] args) {

        canComplete("butl", "beautiful");
    }

    // canComplete("butl", "beautiful") ➞ true

    public static void canComplete(String word1, String word2) {

        StringBuffer word2Buffer = new StringBuffer(word2);
        String unknownChars = "";

        for (int i = 0; i < word2Buffer.length(); i++) {
            if (word1.contains(Character.toString(word2Buffer.charAt(i)))) {
                word2Buffer.delete(i, i + 1);
                i = 0;
            }
        }

        unknownChars = word2Buffer.toString();

        System.out.println("unknownChars = " + unknownChars);

        word2Buffer.setLength(0);
        word2Buffer.append(word2);

        System.out.println("word2Buffer = " + word2Buffer);


        for (int i = 0; i < word2Buffer.length(); i++) {
            if (unknownChars.contains(Character.toString(word2Buffer.charAt(i)))) {
                word2Buffer.delete(i, i + 1);
                i = 0;
            }
        }
        System.out.println("word2Buffer = " + word2Buffer);

    }

}
