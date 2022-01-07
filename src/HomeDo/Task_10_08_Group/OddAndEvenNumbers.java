package HomeDo.Task_10_08_Group;

import java.util.Scanner;

public class OddAndEvenNumbers {

    public static void main(String[] args) {

        /*
        2. Numbers - Odd & Even
         Write  a method which can identifies given number is even or odd
         EX:
         identify(5) ->  "Odd"
         identify(6) ->  "Even"

         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");

    }
}
