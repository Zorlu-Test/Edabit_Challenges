import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_E_Mail_Validation {

/*Basic E-Mail Validation
Create a function that accepts a string, checks if it's a valid email address and returns either true or false, depending on the evaluation.

The string must contain an @ character.
The string must contain a . character.
The @ must have at least one character in front of it. e.g. "e@edabit.com" is valid while "@edabit.com" is invalid.
The . and the @ must be in the appropriate places.
e.g. "hello.email@com" is invalid while "john.smith@email.com" is valid.
If the string passes these tests, it's considered a valid email address.*/


    public static void main(String[] args) {

        String email = "ensar.zorlu@tmt.co.uk";
        //  System.out.println(validEmail(email));

        regex(email);


    }


    public static boolean validEmail(String email) {


        if (!email.contains("@") || !email.contains(".")) {
            return false;
        }

        String[] splitAth = email.split("@");
        String firstPart = splitAth[0];
        String secondPart = splitAth[1];

        if (firstPart.length() < 1) {
            return false;
        }

        String[] secondPartSplit = secondPart.split("\\.");
        for (int i = 0; i < secondPartSplit.length; i++) {
            if (secondPartSplit[i].length() < 2) {
                return false;
            }
        }


        return true;
    }


    public static boolean validEmail2(String email) {
//        boolean result = true;
//
//        if (!email.contains("@") || email.contains(" ")) {
//            return false;
//        }
//        String beforeAth = email.split("@")[0];
//        String afterAth = email.split("@")[1];
//
//        Matcher beforeAthMatch = Pattern.compile("[^a-zA-Z0-9.]").matcher(beforeAth);
//        Matcher afterAthMatch = Pattern.compile("[^a-z0-9.]").matcher(afterAth);
//
//        boolean before = beforeAthMatch.find();
//        boolean after = afterAthMatch.find();
//
//
//
///**
// * Check that the first part contains alphabetic characters and numbers or dot, and that the second part contains the same,
// * but with the restriction that it cannot contain capital letters.
// * */
//        if (before || after ) {
//            return false;
//        }
//


//        return result;
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }

    //"ensar.zorlu@tmt.co.uk"
    public static void regex(String email) {
        //"[^a-zA-Z0-9.]"
        String regexContext = "[^a-zA-Z0-9]";
        Matcher matcher = Pattern.compile(regexContext).matcher(email);

        System.out.println(matcher.find());

    }


}
