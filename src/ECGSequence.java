import java.util.ArrayList;

public class ECGSequence {


    /*In the ECG Sequence (that always starts with the numbers 1 and 2), every number that succeeds is the smallest not already present in the sequence and that shares a factor (excluding 1) with its preceding number. Every number in the ECG Sequence (besides 1 and 2) has a different index from its natural index in a normal numeric sequence. See the example below to establish the ECG Sequence Index of number 3.

// Find the smallest number that is not in sequence...
// This number shares a factor with the preceding?

SEQUENCE = [1, 2]

3 = no factors shared with 2
4 = shares factor 2 with number 2

SEQUENCE = [1, 2, 4]

3 = no factors shared with 4
5 = no factors shared with 4
6 = shares factor 2 with number 4

SEQUENCE = [1, 2, 4, 6]

3 = shares factor 3 with number 6

SEQUENCE = [1, 2, 4, 6, 3]

Number 3 is at index 4 in the ECG Sequence.*/

    // 	1, 2, 4, 6, 3, 9, 12, 8, 10, 5, 15, 18, 14, 7, 21, 24, 16, 20, 22, 11, 33, 27, 30, 25, 35, 28, 26, 13, 39, 36, 32, 34, 17, 51, 42, 38, 19, 57, 45, 40, 44, 46, 23, 69, 48, 50, 52, 54, 56, 49, 63, 60, 55, 65, 70, 58, 29, 87, 66, 62, 31, 93, 72, 64, 68, 74, 37, 111, 75, 78, 76,

    public static void main(String[] args) {

        System.out.println(ecgSeqIndex(69));

    }


    public static int ecgSeqIndex(int num) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);


        int i=3;
        while (true){

            int sequenceNum = i;
            int obtainedNum = list.get(list.size() - 1);

            int min = Math.min(sequenceNum, obtainedNum);

            for (int j = 2; j <= min; j++) {
                if (sequenceNum % j == 0 && obtainedNum % j == 0) {
                    if (!list.contains(sequenceNum)) {
                        i = 2;
                        list.add(sequenceNum);
                        break;
                    }
                }
            }

            if (list.contains(num)){
                break;
            }

            i++;
        }
        System.out.println(list);
        return list.size();
    }


}



