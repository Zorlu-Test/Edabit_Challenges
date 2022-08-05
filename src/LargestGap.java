import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LargestGap {
    public static void main(String[] args) {


        int num[] = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};


        myMet(num);


    }



    public static  void myMet(int []num){

        List<Integer> myList= Arrays.stream(num).boxed().collect(Collectors.toList());

        Collections.sort(myList);

        num= myList.stream().mapToInt(i->i).toArray();

        System.out.println(Arrays.toString(num));




    }

}
