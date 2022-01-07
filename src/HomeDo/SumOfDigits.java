package HomeDo;

import java.util.Scanner;

public class SumOfDigits {



        //* Q8:String -- sum of digits in a string: Write a method that can return the sum of the digits in a string.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        getSum(s1);
    }
    public static void getSum(String s1) {
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            if (Character.isDigit(a)) {
                int b = Integer.parseInt(String.valueOf(a));
               sum = sum + b;

            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else
            System.out.println(sum);
    }
}






