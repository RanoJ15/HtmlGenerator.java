package day20_string;

public class SubstringPractice {

    public static void main(String[] args) {

        String word = "abcdefghi";
                     //012345678
        System.out.println(word.substring(4));


        System.out.println(word.substring(4,6));
        System.out.println(word.substring(4,7));

       // System.out.println(word.substring(4,3));//wrong

        System.out.println(word.substring(0,8));
        System.out.println(word.substring(0,9));
       // System.out.println(word.substring(0,10));wrong
        System.out.println(word.substring(4,4));// nothing
        System.out.println(word.substring(4,5));



    }
}
