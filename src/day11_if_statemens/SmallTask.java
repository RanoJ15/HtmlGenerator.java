package day11_if_statemens;

import java.util.Scanner;

public class SmallTask {

    public static void main(String[] args) {




         // Write an if statement that assigns 5 to x when y is equal to 20
          int y =20;
          int x = 5;

         if(y == 20){

             System.out.println(" x is " + x );


}
         // Write an if statement that sets the variable fees to 50 if the Boolean variable max is true

        int fees =50;
         boolean max = true;
         if(max = true){
             System.out.println("Fees is max  " + fees + " it's " + max );
         }

       //  Write an if statement that assigns 20 to the variable a if variable b is 50 and c is greater and equal to 100

         int a = 0;
         int b = 50;
         int c = 100;

         if(b == 50 && c >= 100){
             a=20;
             System.out.println(" a is " + a);
         }

                // Write an if statement that prints Ideal Temp if the temp is between 70 and 80


        int temp;
        Scanner input = new Scanner(System.in);

            System.out.println(" Enter the temperature ");
            temp = input.nextInt();



        if(temp >= 70 == temp >= 80 ){
         System.out.println(" The temp not Ideal");
         System.out.println(" Stay at home");

        }else{

         System.out.println("The Ideal temp is " + temp);
         System.out.println(" It's nice day to go outside");


                }

       //  Write a program that will accept a boolean value. Print out the opposite of the given boolean

         Scanner scan = new Scanner(System.in);
        System.out.println("Enter True or False");
        boolean trueFalse = input.nextBoolean();

        if(trueFalse = true){
            System.out.println(" Opposite of printed: " + !trueFalse );


        }










































    }
}
