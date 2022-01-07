package day7_unary_operators;

public class KgTopounds {

    public static void main(String[] args) {

          int kgTen = 10;
          int kgTwenty = 20;
          double onePound = 2.20462;

        System.out.println(" 10 kg.equal to:" + (kgTen * onePound) + " pounds");
        System.out.println(" 20 kg equal to:" + (kgTwenty * onePound) + " pounds");


        int a = 100;
        int b = - ++a * -a-- / a++ + --a;


        int anser = a;
        int anser2 = b;
        System.out.println(anser);
        System.out.println(anser2);








    }
}
