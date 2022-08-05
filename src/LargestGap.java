import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LargestGap {


    /*
    * Given an array of integers, return the largest gap between the sorted elements of the array.

For example, consider the array:

[9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
... in which, after sorting, the array becomes:

[0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
... so that we now see that the largest gap in the array is between 9 and 20 which is 11.
* */

    public static void main(String[] args) {


        int num[] = {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};
        System.out.println(myMet(num));

    }


    public static int myMet(int[] num) {

        List<Integer> myList = Arrays.stream(num).boxed().collect(Collectors.toList());

        Collections.sort(myList);

        num = myList.stream().mapToInt(i -> i).toArray();

        int max = 0;


        for (int i = 0; i < num.length - 1; i++) {

            if (max < num[i + 1] - num[i]) {
                max = num[i + 1] - num[i];
            }


        }


        return max;
    }

}
