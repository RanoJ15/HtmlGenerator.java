package day_09s_relational_logical_operators;

public class ShortCircuit {

    public static void main(String[] args) {

        System.out.println(true);
        System.out.println(false);

        // System.out.println(true && 5/0 == 0); problem

        System.out.println(false);
        // System.out.println(false & 5/0 == 0); problem

        System.out.println(true);

        System.out.println("or");
        System.out.println(true);
        // System.out.println(true | 5/0 == 0);

        int count = 5;

        System.out.println(count++ == 5 || ++count == 7);
        System.out.println(count);

        int count2 = 5;

        System.out.println(count2++ == 5 | ++count2 == 7);
        System.out.println(count2);

    }
}
