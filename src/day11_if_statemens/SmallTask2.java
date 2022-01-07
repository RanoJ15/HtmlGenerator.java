package day11_if_statemens;

import java.util.Scanner;

public class SmallTask2 {

    public static void main(String[] args) {

        // [If statements, operators]Write a program that will accept your salary amount. Then also ask the user if they are full time or not (boolean). If they are fulltime add 20000 to their salary, but if they are part time then subtract 5000. Print the final salary.

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your salary of week");
        double salary = input.nextDouble();
        System.out.println("Are you worked full time");
        System.out.println(" Chose:  True or False ");
        boolean fullTime = input.nextBoolean();


        if (fullTime == true) {

            System.out.println(" Your salary is:" + (salary + 20000));

        }else {
            System.out.println(" Your salary is: " + (salary - 5000));

        }

       // Write Java program that will have three numbers and print the greatest number.
        // First number: 4
        // Second number: 8
        // Third number: 1O
        // utput:The greatest number from 4, 8, 1 is:  8

        int first = 4;
        int second = 8;
        int third = 10;
         int biggest = 0;

        if(first > second && first > third){
            biggest = first;
            System.out.println("First number is bigger");
        }
        if(second > first && second > third){
            biggest = second;
            System.out.println("Second number is bigger");
              }
        if( third > first && third > second){
            biggest = third;
            System.out.println("Third number is bigger");
        }
        System.out.println(" Biggest number is: " + biggest);







        }


    }


