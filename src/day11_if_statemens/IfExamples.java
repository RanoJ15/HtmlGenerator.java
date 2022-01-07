package day11_if_statemens;

public class IfExamples {

    public static void main(String[] args) {

        if (true) {
            System.out.println("Hellow word");
        }
        if (false) {
            System.out.println("Hellow word 2");
        }

        int score = 30;
        if (score > 60) ;{
            System.out.println("You passed");
        }
        if (score <= 60){
            System.out.println("You failed");
        }
        if (score >= 60){
            System.out.println("You passed");
        }else{
            System.out.println("You failed");
        }
    }
}