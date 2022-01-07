package day05_variables;

import static com.sun.deploy.util.BufferUtil.GB;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Sumsung";
        String model = "Note 10+";
        String color = "Black";
        double price = 1099.99;
        int storage = 256;
        boolean hasCamera = true;

        color ="Silver"; // reassigne

        System.out.println(" Brand name: " + brand);
        System.out.println("Information for the "+model);
        System.out.println(model + " is a " + brand + " phone ");
        System.out.println("This phone comes in " + color + " and has " +  + storage+"GB of memory");
        System.out.println("Has a camera:" + hasCamera);
        System.out.println("All of this for $" + price);











    }
}
