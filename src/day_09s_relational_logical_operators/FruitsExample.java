package day_09s_relational_logical_operators;

public class FruitsExample {

    public static void main(String[] args) {

        int apples = 5; // 7
        boolean check = apples++ * 2 >= 12 && ++apples + 3 == 10;
        //              5 * 2 >= 12 && 7 + 3 == 10
        //              10 >= 12 && 7 + 3 == 10
        //              10 >= 12 && 10 == 10
        //              false && 10 == 10
        //              false && true
        //              false
        System.out.println(check);

    }
}
