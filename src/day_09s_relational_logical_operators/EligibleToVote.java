package day_09s_relational_logical_operators;

public class EligibleToVote {

    public static void main(String[] args) {

        boolean isUSCitizen = true;
        int age = 30;
        boolean hasCriminalBackground = false;

        boolean isEligible = isUSCitizen && age >= 18 && !hasCriminalBackground;

        System.out.println(isEligible);
        // come back 12:20 est


    }
}
