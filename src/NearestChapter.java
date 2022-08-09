import java.util.regex.Matcher;

public class NearestChapter {

    /*Create a function that returns which chapter is nearest to the page you're on. If two chapters are equidistant, return the chapter with the higher page number.

Examples
nearestChapter(new Chapter[] {
  new Chapter("Chapter 1", 1),
  new Chapter("Chapter 2", 15),
  new Chapter("Chapter 3", 37)
}, 10) ➞ "Chapter 2"

nearestChapter(new Chapter[] {
  new Chapter("New Beginnings", 1),
  new Chapter("Strange Developments", 62),
  new Chapter("The End?", 194),
  new Chapter("The True Ending", 460)
}, 200) ➞ "The End?"

nearestChapter(new Chapter[] {
  new Chapter("Chapter 1a", 1),
  new Chapter("Chapter 1b", 5)
}, 3) ➞ "Chapter 1b"
Notes
All page numbers in the dictionary will be valid integers.
Return the higher page number if ever two pages are equidistant (see test case #8).
A similar version of this challenge that uses Map-type classes instead of custom ones can be found via this link. */

    public static void main(String[] args) {

        Chapter[] chapter = {new Chapter("Chapter 1a", 1),
                new Chapter("Chapter 1b", 5),
                new Chapter("Chapter 1c", 50),
                new Chapter("Chapter 1d", 100),
                new Chapter("Chapter 1e", 200),
                new Chapter("Chapter 1f", 400)
        };

        System.out.println(nearestChapter(chapter, 300));


    }


    public static String nearestChapter(Chapter[] chapter, int a) {

        int dummyNum = Math.abs(chapter[0].num - a);
        int dummyPhaseNum = 0;
        String myWord = "";

        for (int i = 0; i < chapter.length; i++) {

            if (Math.abs(chapter[i].num - a) < dummyNum) {
                dummyNum = Math.abs(chapter[i].num - a);
                myWord = chapter[i].str;
                dummyPhaseNum = i;
            }

            if (dummyNum == Math.abs(chapter[i].num - a)) {
                if (chapter[i].num > chapter[dummyPhaseNum].num) {
                    myWord = chapter[i].str;
                } else {
                    myWord = chapter[dummyPhaseNum].str;
                }
            }

        }


        return myWord;
    }


    public static class Chapter {

        String str;
        int num;


        public Chapter(String str, int num) {
            this.str = str;
            this.num = num;
        }
    }


}
