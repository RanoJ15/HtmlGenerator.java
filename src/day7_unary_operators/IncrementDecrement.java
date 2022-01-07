package day7_unary_operators;

public class IncrementDecrement {

    public static void main(String[] args) {


      int n=0;
      n++;

        System.out.println(n);//1
        System.out.println(++n);//2

        System.out.println(n++); //prints 2,but n still increment after
        System.out.println(n); //prins 3


        int age = 10;

        System.out.println(age);
        System.out.println(age++);//10
        System.out.println(age);//11
        System.out.println(++age);//12
        System.out.println(age);//12
        System.out.println(age++ * 2);//24
        System.out.println(age);//13

        System.out.println(++age +2);







    }
}
