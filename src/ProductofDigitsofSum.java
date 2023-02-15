public class ProductofDigitsofSum {

/*Create a function that takes one, two or more numbers as arguments and adds them together to get a new number. The function then repeatedly multiplies the digits of the new number by each other, yielding a new number, until the product is only 1 digit long. Return the final product.

Examples
sumDigProd(16, 28) ➞ 6
// 16 + 28 = 44
// 4 * 4 =  16
// 1 * 6 = 6

sumDigProd(0) ➞ 0

sumDigProd(1, 2, 3, 4, 5, 6) ➞ 2*/


    public static void main(String[] args) {


        long l = sumDigProd(1, 2, 3, 4, 5, 6);
        System.out.println("l = " + l);


    }



    public static long sumDigProd(long... myLongs) {
        Long total = 0L;
        for(long myLong : myLongs){
            total += myLong;
        }
        String sLong = total.toString();
        while(sLong.length() > 1) {
            total = 1L;
            for(int i = 0; i < sLong.length(); i++) {
                total *= Character.getNumericValue(sLong.charAt(i));
            }
            sLong = total.toString();
        }



        return total;
    }



}
