package day_09s_relational_logical_operators;

import java.util.Scanner;

public class ScannerDate {

    public static void main(String[] args) {

         /*
            Ask the user to enter the month number
            Ask the user to enter the day number
            Ask the user to enter the year number
            8/7/2021
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number");
        //int month = 8; -> old, hardcoded way
        int month = input.nextInt();

        System.out.println("Enter the day number");
        int day = input.nextInt();

        System.out.println("Enter the year number");
        int year = input.nextInt();

        System.out.println(month + "/" + day + "/" + year);


        // come back at 3:20 est




    }
}
