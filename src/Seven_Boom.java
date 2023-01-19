import java.sql.Driver;
import java.util.Arrays;

public class Seven_Boom {

    /*
   Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".

Examples
sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
// 7 contains the number seven.

sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
// None of the items contain 7 within them.

sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
// 97 contains the number seven.

   */

    public static void main(String[] args) {


        int[] numbers = {1, 7, 3, 4, 5, 6, 17, 27};

        sevenBoom(numbers);


    }


    public static String  sevenBoom(int[] numberArray) {

        //int []numbers={1,2,3,4,5,6,7};

        Boolean myDummy = false;
        String myNum = "";


        for (int i = 0; i < numberArray.length; i++) {
            myNum = numberArray[i] + "";
            System.out.println("myNum = " + myNum);

            if (myNum.contains("7")) {
                myDummy = true;
               System.out.println("Boom!");
                myDummy=true;
            }
        }

        if (myDummy==true){
            return "Boom!";
        }else {
            return "Hahah kactim";
        }

    }


}
