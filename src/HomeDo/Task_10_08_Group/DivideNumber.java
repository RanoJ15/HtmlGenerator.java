package HomeDo.Task_10_08_Group;

import java.util.Scanner;

public class DivideNumber {

    public static void main(String[] args) {

        /*
        3. Numbers -- Divide without / operator
        Write a method that can divide two numbers without using division operator

         */


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scan.nextInt();

                int result = 0;
                while (num1 >= num2) {
                num1 = num1 - num2;
                result++;

            }

            if (result % 2 == 0) {
                System.out.println(result);
            } else if (result % 2 == 1) {
                System.out.println("Number to divide with remainder");

            }

        System.out.println();

        //Divide without / operator:


            if(num2==0) {

                System.out.println("Invalid Number");

                return;

            }

            System.out.print(num1 +" devid by "+num2 +" is: ");

            int count =0;

            while(num1 >= num2) {

                num1 -= num2;

                count++;

            }

            System.out.println(count+" and remainder is "+num1);

        }

        }








