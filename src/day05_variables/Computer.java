package day05_variables;


public class Computer {

    public static void main(String[] args) {

        String brandName = "Dell Optiplex 5482";
        String typeProcessor = " i5-10500T 6-Core";
        int ramMemory = 8;
        int storageMemory = 256;
        boolean dellMonitor = true;
        boolean wifiCard = true;
        int yearDescription =2021;
        int price = 980;
        String dellCPU = "2.3 GHz Intel";
        String dellColor = " Black ";
        int monitorNum = 1;
        int usbSlots = 4;

        System.out.println("Computer's brand name:" + brandName );
        System.out.println("Computer's processor type:" + typeProcessor);
        System.out.println("Computer's ram memory:"+ ramMemory + " GB ");
        System.out.println("Computer's storage memory:" + storageMemory + " GB ");
        System.out.println("Computer has a monitor:"+ dellMonitor);
        System.out.println("Computer has the Wifi Card:" + wifiCard);
        System.out.println("The computer was produced :" + yearDescription + " year ");
        System.out.println("The computer's price :$ " + price);
        System.out.println("Computer's CPU:" + dellCPU);
        System.out.println("The computer's color:" + dellColor);
        System.out.println("Computer's has:" + monitorNum + " monitor ");
        System.out.println("The computer's has:" + usbSlots + " slots ");
        System.out.println("Computer doesn't have USB 3.0");




    }
}
