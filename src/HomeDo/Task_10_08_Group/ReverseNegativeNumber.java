package HomeDo.Task_10_08_Group;

import java.util.Scanner;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        /*

       4. Number -- Reverse negative number
       Write a return method that can reverse negative number and return it as int



 */
        System.out.print("Enter the number that you want to reverse: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int reverseNum = reverseNumber(num);
        System.out.println("The reverse of the given number is: " + reverseNum);
    }

        //method to reverse a number
        public static int reverseNumber ( int number){

            boolean isNoNegative = number < 0 ? true : false;
            if (isNoNegative) {
                number = number * -1; //makes the number positive if the given number is negative
            }
            int reverse = 0;
            int lastDigit = 0;
            while (number >= 1) {
                lastDigit = number % 10; // gives the last digit of the number
                reverse = reverse * 10 + lastDigit;
                number = number / 10; // removes the last digit of the number
            }
            //makes the number negative
            return isNoNegative == true ? reverse * -1 : reverse;


            //Reverse negative number Solution:

           /* public static int reverseNum(int  num2) {

                String str = new StringBuilder(""+num2).reverse().toString();

                if(num2 < 0) {

                    str = "-"+str.substring(0, str.length()-1);

                }

                return Integer.valueOf(str);

            */

            }

        }


