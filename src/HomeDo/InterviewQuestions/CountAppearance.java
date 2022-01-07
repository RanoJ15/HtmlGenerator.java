package HomeDo.InterviewQuestions;

import java.util.Scanner;

public class CountAppearance {

    public static int countAppearance(String[] arr, String t) {

        String [] allWords = t.split(" ");
        return allWords.length;




    } //end  count_appearance

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        String word = in.next();
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs, word));

    }
}
