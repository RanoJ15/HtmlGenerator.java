package day08_relational_logical_operators;

public class RelationalOperators {

    public static void main(String[] args) {


        System.out.println("5 > 3:" + (5>3));
        System.out.println("5 < 3:" + (5<3));

        int a = 5;
        int b = 4;
        System.out.println("a > b:" + (a > b));
        System.out.println("a > b: " + (a > b));

        boolean checkAEqualtob = a ==b;
        System.out.println(" == b:" + checkAEqualtob);

        boolean checkANotEqualTOB = a != b;
        System.out.println("a != b:" + checkANotEqualTOB);

        System.out.println(!true);


    }
}
