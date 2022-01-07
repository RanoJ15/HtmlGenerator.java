package day22_loops;

import java.util.Scanner;

public class
        AddNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        boolean positiveNumber = true;

        while(positiveNumber){

            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number < 0){
                positiveNumber = false;
            } else {
                sum += number; // sum = sum + number
            }

        }

        System.out.println("Sum: " + sum);


    }
}
