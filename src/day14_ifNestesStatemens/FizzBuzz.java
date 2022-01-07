package day14_ifNestesStatemens;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

         /*
    add new class FizzBuzz
main method
Task: Evaulate your number and print based on the following:
    multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”. If the number is not disibile by any of those numbers print just the number
    Example:
        number = 6
        "FizzBuzz" -> when number is divisible by 3 and  5
        "Fizz" -> when number is divisible by 3
        "Buzz" -> when number is divisible by 5
     */


        Scanner input = new Scanner(System.in);
//        int number = 7;
        int number = input.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

//          order matters in this case

//        if(number % 3 == 0){
//            System.out.println("Fizz");
//        } else if(number % 5 == 0){
//            System.out.println("Buzz");
//        } else if(number % 3 == 0 && number % 5 == 0){
//            System.out.println("FizzBuzz");



      /* 2th way to solution

        public static String fizzBuzz(int num) {



            String str = "";

            if (num % 3 == 0) {
                str += "Fizz";
            }

            if (num % 5 == 0) {
                str += "Buzz";
            }

            return str.isEmpty() ? "" + num : str;
        }
            public static void main(String[] args){
                System.out.println(fizzBuzz(15));

            }

       */


    }
}


