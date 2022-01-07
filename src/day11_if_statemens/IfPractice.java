package day11_if_statemens;

public class IfPractice {

    public static void main(String[] args) {

        double hourlyyRate =10.5;
        double hoursWorked = 45;
        double netPay;
        String message;

        if(hoursWorked> 40){
            // overtime calculaton

            double overTimeHours = hoursWorked - 40;
            netPay = 40 * hourlyyRate;
            netPay += overTimeHours * hourlyyRate * 1.5; //netpay = netpay + new calc

            message = "Wow you worked " + hoursWorked + " hours so you got paid for " + overTimeHours + " hours overtime, so your total net pay is: " + netPay;



        }else{
            netPay = hoursWorked * hourlyyRate;
            message = " You worked " + hoursWorked + " hour, your total net pay is: " + netPay;
        }
        System.out.println(message);

















    }
}
