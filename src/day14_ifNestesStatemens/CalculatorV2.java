package day14_ifNestesStatemens;

import java.util.Scanner;

public class CalculatorV2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        /*
        ask the user to enter 2 number
        operator - String
        @
        / -> 2nd num = 0
         */


        System.out.println("Enter number one:");
        double numberOne = input.nextDouble();

        System.out.println("Enter the operator\n\t+ - * / %");
        String operator = input.next();

        System.out.println("Enter number two:");
        double numberTwo = input.nextDouble();

        boolean isValidOperator = operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%");

        double result = 0;

        if (isValidOperator) {

            if (operator.equals("+")) {
                result = numberOne + numberTwo;
            } else if (operator.equals("-")) {
                result = numberOne - numberTwo;
            } else if (operator.equals("*")) {
                result = numberOne * numberTwo;
            } else if (operator.equals("/")) {
            } else if (operator.equals("/") && numberTwo != 0) {
                result = numberOne / numberTwo;
            } else if (operator.equals("%")) {
                result = numberOne % numberTwo;


            } else {
                System.out.println(operator + " is not a valid operator");
            }


            if (isValidOperator) {
                System.out.println(numberOne + " " + operator + " " + numberTwo + " = " + result);


            }

        }
    }


}
















