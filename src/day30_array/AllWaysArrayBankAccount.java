package day30_array;

import java.util.Arrays;
import java.util.Scanner;

public class AllWaysArrayBankAccount {
    public static void main(String[] args) {


         /*
            String array
            0 - First name
            1 - account number
            2 - balance
            3 - account type
            do it 3 ways:
                create array with values
                create empty array and fill with values
                create empty array and fill with values through scanner
         */
      //1
        String[] bankAccountOne = {"Bond", "12345", "600.00", "Saving"};

        System.out.println(Arrays.toString(bankAccountOne));
       //2
        String[] bankAccountTwo = new String[4];

        bankAccountTwo[0] = "James";
        bankAccountTwo[1] = "123456";
        bankAccountTwo[2] = "10000";
        bankAccountTwo[3] = "Saving";

        System.out.println(Arrays.toString(bankAccountTwo));
      //3
        Scanner input = new Scanner(System.in);

        String[] bankAccountThree = new String[4];
        System.out.println("Enter your Name");
        bankAccountThree[0] = input.next();
        System.out.println("Enter your account number");
        bankAccountThree[1] = input.next();
        System.out.println("Enter balance your account");
        bankAccountThree[2] = input.next();
        System.out.println("Enter type account");
        bankAccountThree[3] = input.next();

        System.out.println(Arrays.toString(bankAccountThree));

        // Dynamic scanner input with arrays
       //4
        String[] bankAccountFour = new String[4];
        String[] questions = {"first name", "account number", "balance", "account type"};

        for (int i = 0; i < bankAccountFour.length; i++) {
            System.out.println("Enter your " + questions[i]);
            bankAccountFour[i] = input.next();

            System.out.println("Fourth account: " + Arrays.toString(bankAccountFour));


        }
    }
}