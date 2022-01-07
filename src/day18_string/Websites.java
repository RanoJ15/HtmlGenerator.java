package day18_string;

import java.util.Scanner;

public class Websites {

    public static void main(String[] args) {

         /*
        Ask the user to type a website
        Check if the website is valid
            A website is valid if:
                begins with
                    www.
                and
                 at the end has:
                    .com
                    .edu
                    .gov
                    .net
     */



            Scanner input = new Scanner(System.in);
            System.out.println("Enter a website");
            String website = input.nextLine();

            boolean validStart = website.startsWith("www.");
            boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");

            if (validStart && validEnd) {
                System.out.println(website + " is valid");
            } else {

                if (!validStart) {
                    System.out.println("needs to begin with www.");
                } else {
                    System.out.println("needs to end with: .com\n.edu\n.gov\nor .net");
                }

            }


        }
    }
