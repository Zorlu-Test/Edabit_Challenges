import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class RemoveTheWord {

    /*
    Create a function that takes an array and string. The function should remove the letters in the string from the array, and return the array.

Examples
removeLetters(["s", "t", "r", "i", "n", "g", "w"], "string") ➞ ["w"]

removeLetters(["b", "b", "l", "l", "g", "n", "o", "a", "w"], "balloon") ➞ ["b", "g", "w"]

removeLetters(["d", "b", "t", "e", "a", "i"], "edabit") ➞ []
Notes
If number of times a letter appears in the array is greater than the number of times the letter appears in the string, the extra letters should be left behind (see example #2).
If all the letters in the array are used in the string, the function should return an empty array (see example #3).
    */


    public static void main(String[] args) {


        String[] a = {"s", "t", "r", "i", "n", "g", "w"};
        String str = "string";


        findWord(a, str);

    }


    public static void findWord(String[] a, String str) {

        String strArray[] = str.split("");


        for (int i = 0; i < a.length; i++) {
            int count=0;
            for (int j = 0; j < strArray.length; j++) {

                if (a[i].equals(strArray[j])&& count==0){

                    a[i]="";
                    strArray[j]="";

                }
            }
        }

        List<String> a1=new ArrayList<>(Arrays.asList(a));

        a1.removeIf(m->m.isEmpty());

        System.out.println(a1);


    }


}
