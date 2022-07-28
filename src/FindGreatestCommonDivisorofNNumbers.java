public class FindGreatestCommonDivisorofNNumbers {

    /*
     Create a function that takes an array of numbers and returns the greatest common factor of those numbers.

Examples
gcd({84, 70, 42, 56}) ➞ 14

gcd({19, 38, 76, 133}) ➞ 19

gcd({120, 300, 95, 425, 625}) ➞ 5
*/

    public static void main(String[] args) {


        int numbers[] = {84, 70, 42, 56};

        gcd(numbers);

    }


    public static void gcd(int[] a) {

        int k = 1;
        int minNum = a[0];


        for (int i = 0; i < a.length; i++) {

            if (minNum>a[i]){
                minNum=a[i];
            }


        }

        System.out.println(minNum);


        for (int i = 0; i < a.length; i++) {





        }


    }


}
