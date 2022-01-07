package day19_string;

public class MergeChars {

    public static void main(String[] args) {

        String firstPart = "abc";
        String secondPart ="def";
        System.out.println("" + firstPart.charAt(0) + firstPart.charAt(1) + firstPart.charAt(2) + secondPart.charAt(0) +secondPart.charAt(1) + secondPart.charAt(2));



        //other way

        String one = "abc";
        String two = "def";


        String merged = "";
        merged += one.charAt(0); // merged = merged + one.charAt(0); -> merged = "" + a
        merged += two.charAt(0); // merged = merged + two.charAt(0); -> merged = a + d

        merged += one.charAt(1);  // merged = merged + two.charAt(1); -> merged = ad + b
        merged += two.charAt(1);

        merged += one.charAt(2);
        merged += two.charAt(2);

        System.out.println(merged);

    }
}
