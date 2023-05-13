public class Capitalize_The_Last_Letter {

/*Capitalize the Last Letter
Create a function that capitalizes the last letter of every word.

Examples
capLast("hello") ➞ "hellO"

capLast("My Name Is Edabit") ➞ "MY NamE IS EdabiT"

capLast("HELp THe LASt LETTERs CAPITALISe") ➞ "HELP THE LAST LETTERS CAPITALISE"
Notes
There won't be any cases of punctuation in the tests.*/


    public static void main(String[] args) {


//        String edabit = capLast("My Name Is Edabit");
//        System.out.println(edabit);

        System.out.println(capLast2("My Name Is Edabit"));

    }


    public static String capLast(String str) {
        String[] singleStr = str.split(" ");
        String dummy = "";
        for (int i = 0; i < singleStr.length; i++) {
            StringBuffer buffer = new StringBuffer(singleStr[i]);
            char lastChar = Character.toUpperCase(buffer.charAt(buffer.length() - 1));
            buffer.setCharAt(buffer.length() - 1, lastChar);
            dummy = dummy + buffer.toString() + " ";
        }
        dummy = dummy.trim();
        return dummy;
    }

    // My Name Is Edabit
    public static String capLast2(String str) {
        String[] singleStr = str.split(" ");

        String dummy = "";

        for (int i = 0; i < singleStr.length; i++) {
            String myWord = singleStr[i];
            String strNoLastChar = myWord.substring(0, myWord.length() - 1);
            char upperCaseLastChar = Character.toUpperCase(myWord.charAt(myWord.length() - 1));
            dummy = dummy+strNoLastChar + upperCaseLastChar+" ";
        }


        return dummy.trim();
    }


//    public static void capLast(String str) {
//
//        String[] singleStr = str.split(" ");
//        String dummy = "";
//
//        for (int i = 0; i < singleStr.length; i++) {
//
//            StringBuffer stringBuffer = new StringBuffer(singleStr[i]);
//            String lastChar = (stringBuffer.charAt(stringBuffer.length() - 1) + "").toUpperCase();
//            stringBuffer.setCharAt(stringBuffer.length() - 1, lastChar.charAt(0));
//            dummy = dummy + stringBuffer.toString() + " ";
//
//        }
//
//        dummy = dummy.trim();
//
//        System.out.println("dummy = " + dummy);
//
//    }


}
