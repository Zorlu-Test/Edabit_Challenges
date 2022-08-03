public class ValidateCreditCardNumber {

    /*
    * Create a function that takes a number as an argument and returns true if the number is a valid credit card number, false otherwise.

Credit card numbers must be between 14-19 digits in length, and pass the Luhn test, described below:

Remove the last digit (this is the "check digit").
Reverse the number.
Double the value of each digit in odd-numbered positions. If the doubled value has more than 1 digit, add the digits together (e.g. 8 x 2 = 16 ➞ 1 + 6 = 7).
Add all digits.
Subtract the last digit of the sum (from step 4) from 10. The result should be equal to the check digit from step 1.
Examples
validateCard(1234567890123456) ➞ false

// Step 1: check digit = 6, num = 123456789012345
// Step 2: num reversed = 543210987654321
// Step 3: digit array after selective doubling: [1, 4, 6, 2, 2, 0, 9, 8, 5, 6, 1, 4, 6, 2, 2]
// Step 4: sum = 58
// Step 5: 10 - 8 = 2 (not equal to 6) ➞ false

validateCard(1234567890123452) ➞ true

// Same as above, but check digit checks out.
* */

    public static void main(String[] args) {

        long num = 36717601781975L;


        System.out.println(validateCard(num));


    }


    public static boolean validateCard(long num) {


        String dummy = num + "";
        int dummyArray[] = new int[dummy.length() - 1];
        int sum = 0;
        String checkdigit = dummy.replace(dummy.substring(0, dummy.length() - 1), "");

        if (dummy.length() >= 14 && dummy.length() <= 19) {

            dummy = dummy.substring(0, dummy.length() - 1);

            StringBuilder a = new StringBuilder(dummy);
            dummy = a.reverse().toString();


            for (int i = 0; i < dummy.length(); i++) {

                if (i % 2 == 0) {

                    if (Integer.parseInt(dummy.charAt(i) + "") * 2 > 9) {
                        int a1 = Integer.parseInt(dummy.charAt(i) + "") * 2;
                        String totalOverTen = a1 + "";
                        dummyArray[i] = Integer.parseInt(totalOverTen.charAt(0) + "") + Integer.parseInt(totalOverTen.charAt(1) + "");

                    } else {
                        dummyArray[i] = Integer.parseInt(dummy.charAt(i) + "") * 2;
                    }

                } else {
                    dummyArray[i] = Integer.parseInt(dummy.charAt(i) + "");
                }

                sum = sum + dummyArray[i];
            }

        } else {
            return false;
        }

        String sumStr=sum+"";

        if (10-Integer.parseInt(sumStr.charAt(sumStr.length()-1)+"")==Integer.parseInt(checkdigit)){
            return true;
        }else {
            return false;
        }

    }


}
