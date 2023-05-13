public class Longest_Word {

/*Longest Word
Write a function that finds the longest word in a sentence and returns it. If two or more words are the biggest, return the word closest to the start of the sentence. Characters such as apostrophe, commas, periods, etc count as letters (e.g. O'Connor is 8 characters long).

Examples
longestWord("Hello darkness my old friend") ➞ "darkness"

longestWord("Hello there mate") ➞ "Hello"

longestWord("Kayla's toy is plastic") ➞ "Kayla's"*/

    public static void main(String[] args) {

        longestWord("Create a function that accepts a string,");
    }

    public static String longestWord(String word) {

        String[] splitedWord = word.split(" ");
        int dummy = 0;
        String dummyStr="";


        for (int i = 0; i < splitedWord.length; i++) {
            String singleWord = splitedWord[i];
            if (dummy < singleWord.length()){
                dummy = singleWord.length();
                dummyStr=singleWord;
            }


        }

        System.out.println(dummyStr);

        return dummyStr;
    }


}
