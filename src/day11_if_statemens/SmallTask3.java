package day11_if_statemens;

import java.util.Scanner;

public class SmallTask3 {

    public static void main(String[] args) {

     //  [If statements, operators]
        //  Write a program that will give the grade after the retake. The program should read a score of the test and which attempt it was.
        //  If its the first attempt -> subtract 10%
        //  If its the second attempt -> subtract 20%
        //  If its the third attempt -> subtract 35%

        Scanner input = new Scanner(System.in);

        System.out.println("What kind of attempt is this?");
        int attempt = input.nextInt();
        System.out.println(" Enter your grade after attempt");
        int grade = input.nextInt();

        double finalGrade =0;

        if(attempt == 1){
            finalGrade =  grade - (grade * 0.1); // 80 -> 80 * .1 = 80 - 8 => 72
        } else if (attempt == 2){
            finalGrade =  grade - (grade * 0.2);
        } else if(attempt == 3){
            finalGrade =  grade - (grade * 0.35);
        }

        System.out.println("After attempt " + attempt + " your final grade is " + finalGrade + "%");





















    }
}
