package day7_unary_operators;

public class increment2 {

    public static void main(String[] args) {

        int i = 5;
        i++;//=6
        int x=i++; //int x=6,i becomes 7

        System.out.println("x:"+ x);
        System.out.println("i:"+ i);

        int b = 10; //11
        int c = ++b; //int c =b;
        System.out.println("b:" + b);
        System.out.println("c:" + c);



    }
}
