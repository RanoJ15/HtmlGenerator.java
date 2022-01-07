package day14_ifNestesStatemens;

public class DebugExample {

    public static void main(String[] args) {

        int a = 4;
        int b = 5;

        if(a > b){
            System.out.println("A");

            if (a > b) {
                System.out.println("B");


            }
        }

    }
}