import java.util.Scanner;

public class Prime_Fibonacci_and_Odd_number {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        System.out.println(conditionChecker(userNumber));

    }


    /**
     * Condition checker method decide condition preferences and return String it can be changed according to the need or overload it.
     */
    public static String conditionChecker(int number) {

        if (primeNumber(number) && oddNumber(number) && fibonacciNumber(number)) {
            return "That number is Prime, Fibonacci and Odd number!";
        } else {
            return "That number is not a member of the intersection of the Prime, Fibonacci, and Odd clusters.";
        }

    }

    /**
     * Prime numbers are numbers greater than 1.
     * They only have two factors, 1 and the number itself.
     * This means these numbers cannot be divided by any number other than 1 and the number itself without leaving a remainder.
     * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 are prime number
     */
    public static boolean primeNumber(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Odd numbers are those numbers that cannot be divided into two parts equally.
     * In other words, odd numbers are positive integers that cannot be categorized into groups of two.
     * For example: 1, 3, 5, 7, etc. Let us visualize it using an example of footwear and cherries
     */
    public static boolean oddNumber(int number) {

        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }

    }

    /**
     * The sequence follows the rule that each number is equal to the sum of the preceding two numbers.
     * The Fibonacci sequence begins with the following 14 integers:  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 ...
     * Each number, starting with the third, adheres to the prescribed formula.
     */

    public static boolean fibonacciNumber(int number) {
        int firstNum = 0;
        int secondNum = 1;
        int fibonacciNumbers = 0;

        for (int i = 0; i < number; i++) {

            fibonacciNumbers = secondNum + firstNum;

            firstNum = secondNum;

            secondNum = fibonacciNumbers;

            if (fibonacciNumbers > number) {
                fibonacciNumbers = fibonacciNumbers - (fibonacciNumbers - firstNum);
                break;
            }
        }

        if (fibonacciNumbers == number) {
            return true;
        } else {
            return false;
        }

    }


}
