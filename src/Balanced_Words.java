import java.util.Map;
import java.util.TreeMap;

public class Balanced_Words {

    public static void main(String[] args) {


        String word = "brake";
        balancedWords(word);


    }


    public static void balancedWords(String word) {


        String alphabet = "";

        Map<String, Integer> wordsQue = new TreeMap<>();


        for (int i = 'a'; i <= 'z'; i++) {
            wordsQue.put(Character.toString(i), i - 96);
            alphabet = alphabet + Character.toString(i);
        }


        int middle = word.length() / 2;
        String firstPart = word.substring(0, middle);
        String secondPart = word.substring(middle);

        if (firstPart.length() < secondPart.length()) {
            secondPart = secondPart.substring(1);
        }


        int firstTotal = 0;
        int secondTotal = 0;


        for (int i = 0; i < firstPart.length(); i++) {

            firstTotal=firstTotal+wordsQue.get(firstPart.charAt(i)+"");

            secondTotal=secondTotal+wordsQue.get(secondPart.charAt(i)+"");

        }


        System.out.println("firstTotal = " + firstTotal);

        System.out.println("secondTotal = " + secondTotal);


    }


}
