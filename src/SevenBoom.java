import java.util.ArrayList;
import java.util.Arrays;

public class SevenBoom {

/*Seven Boom!
Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".

Examples
sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
// 7 contains the number seven.

sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
// None of the items contain 7 within them.

sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
// 97 contains the number seven.
Notes
N/A*/


    public static void main(String[] args) {


        Integer []b={1, 2, 3, 4, 5, 6, 75};

        ArrayList<Integer> a=new ArrayList(Arrays.asList(b));

        System.out.println(sevenBoom(a));
    }

    public  static String sevenBoom(ArrayList<Integer> a){

        String myReturn="";

        for (int i = 0; i < a.size(); i++) {

            String mySeven= a.get(i)+"";
            if (mySeven.contains("7")){
                myReturn= "Boom!";
            }else {

                myReturn= "there is no 7 in the array";
            }

        }



        return myReturn;
    }


}
