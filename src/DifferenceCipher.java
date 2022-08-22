public class DifferenceCipher {
/*Difference Cipher
It's time to send and receive secret messages.

Create two functions that take a string and an array and returns a coded or decoded message.

The first letter of the string, or the first element of the array represents the Character Code of that letter. The next elements are the differences between the characters: e.g. A +3 --> C or z -1 --> y.

Examples
encrypt("Hello") ➞ [72, 29, 7, 0, 3]
// H = 72, the difference between the H and e is 29 (upper- and lowercase).
// The difference between the two l's is obviously 0.

decrypt([ 72, 33, -73, 84, -12, -3, 13, -13, -68 ]) ➞ "Hi there!"

encrypt("Sunshine") ➞ [83, 34, -7, 5, -11, 1, 5, -9]
Notes
The input of the encrypt function will always be a string.
The input of the decrypt function will always be an array with numbers.*/


    public static void main(String[] args) {


        decrypt(new int[]{84, 27,  -2,  2,  3,  0,  -3,  8,  -75,  -12,  19,  -19,  80,  -3,  -77,  73,  5,  -78,  84,  -12,  -3,  -69,  71,  -6,  17,  -14,  1,  9,  -64});

    }


    public static String decrypt(int[] nums) {


        String dummy =Character.toString(nums[0])+"";
        int charCod = nums[0];


        for (int i = 1; i < nums.length; i++) {

            charCod=charCod+ nums[i];

            dummy = dummy + Character.toString(charCod);

        }

        System.out.println(dummy);

        return dummy;
    }


}
