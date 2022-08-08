public class Strong_Password {
    /*Create a function that determines the minimum number of characters needed to make a strong password.

A password is considered strong if it satisfies the following criteria:

Its length is at least 6.
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character: !@#$%^&*()-+
Types of characters in a form you can paste into your solution:

static final String numbers = "0123456789";
static final String lower_case = "abcdefghijklmnopqrstuvwxyz";
static final String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
static final String special_characters = "!@#$%^&*()-+";
Examples
strongPassword(“Ed1”) ➞ 3

strongPassword(“#Edabit”) ➞ 1

strongPassword("W1llth!spass?") ➞ 0
Notes
Try solving this without RegEx.*/

    public static void main(String[] args) {


        String password = "CreateAStrongOne";

        System.out.println(strongPasword(password));


    }


    public static int strongPasword(String password) {
        int reliability = 0;

        String lowerCase = "";
        int lowerCaseCount = 0;
        String higherCase = "";
        int higherCaseCount = 0;
        String special = "!@#$%^&*()-+";
        int specialCount = 0;
        String nums = "0123456789";
        int numsCount = 0;
        int length = 0;

        for (int i = 'a'; i <= 'z'; i++) {
            lowerCase = lowerCase + Character.toString(i);
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            higherCase = higherCase + Character.toString(i);
        }


        for (int i = 0; i < password.length(); i++) {
            if (lowerCase.contains(password.charAt(i) + "")) {
                lowerCaseCount = 1;
            } else if (higherCase.contains(password.charAt(i) + "")) {
                higherCaseCount = 1;
            } else if (special.contains(password.charAt(i) + "")) {
                specialCount = 1;
            } else if (nums.contains(password.charAt(i) + "")) {
                numsCount = 1;
            }

            if (password.length() >= 6) {
                length = 1;
            }

        }


        reliability = lowerCaseCount + higherCaseCount + specialCount + numsCount + length;


        return 5 - reliability;

    }


}
