package day20_string;

public class IndexOfPractice {

    public static void main(String[] args) {

        String word = "banana";

        int firstA = word.indexOf('a');//1

       // int middeleA = word.indexOf('a', 2); hardcoded
        int middeleA = word.indexOf('a', firstA + 1);


        //int lastA = word.lastIndexOf('a');//5
        int lastA = word.lastIndexOf('a', middeleA + 1);

        System.out.println(firstA);
        System.out.println(middeleA);
        System.out.println(lastA);
        System.out.println();

        String s = "001011010";
        //  012345678

        int posOne = s.indexOf('1'); // 2
        int posTwo = s.indexOf('1', posOne + 1);
        int posThree = s.indexOf('1', posTwo + 1);
        int posFour = s.indexOf('1', posThree + 1);
        int posFive = s.indexOf('1', posFour + 1);


        System.out.println(posOne);
        System.out.println(posTwo);
        System.out.println(posThree);
        System.out.println(posFour);
        System.out.println(posFive);


    }
}
