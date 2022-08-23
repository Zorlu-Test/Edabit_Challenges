public class CountLettersinaWordSearch {

    /*Count Letters in a Word Search
Create a function that counts the number of times a particular letter shows up in the word search.

Examples
letterCounter([
  ["D", "E", "Y", "H", "A", "D"],
  ["C", "B", "Z", "Y", "J", "K"],
  ["D", "B", "C", "A", "M", "N"],
  ["F", "G", "G", "R", "S", "R"],
  ["V", "X", "H", "A", "S", "S"]
], "D") ➞ 3

// "D" shows up 3 times: twice in the first row, once in the third row.

letterCounter([
  ["D", "E", "Y", "H", "A", "D"],
  ["C", "B", "Z", "Y", "J", "K"],
  ["D", "B", "C", "A", "M", "N"],
  ["F", "G", "G", "R", "S", "R"],
  ["V", "X", "H", "A", "S", "S"]
], "H") ➞ 2
Notes
You will always be given an array with five sub-arrays.*/


    public static void main(String[] args) {


        String[][] b = {{"D", "E", "Y", "H", "A", "D"},
                {"C", "B", "Z", "Y", "J", "K"}
                , {"D", "B", "C", "A", "M", "N"}
                , {"F", "G", "G", "R", "S", "R"}
                , {"V", "X", "H", "A", "S", "S"}};

        String myLetter = "D";

        letterCounter(b, myLetter);

    }

    public static int letterCounter(String[][] b, String myLetter) {

        int dummy=0;


        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[i].length; j++) {

                if(b[i][j].equals(myLetter)){
                    dummy++;
                }

            }

        }


        System.out.println(dummy);

        return dummy;
    }


}
