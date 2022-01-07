package day05_variables;

public class RentApartment {

    public static void main(String[] args) {

        String ownerName ="Nike";
        String lastName = "Nickson";
        String homeAddress = "1234 Kirk St.";
        String cityStateZip = "NY. NY.7890";
        String phoneNumber = "123-345-6789";
        String emailAddress = "nikeNickson@gmail.com";
        String sizeApartment = "2 bd.1ba. 930 sqft ";
        String floor = " Hardwood";
        String parking = " Off- street";
        String typeStyle = " Apartment";
        String petsAllow = " 35 $ more";
        String laundry = " In building";
        String dataAvailable = " Sep 1 2021";

        System.out.println(" Owner Name:" + ownerName);
        System.out.println(" Owner Last Name:" + lastName);
        System.out.println(" Home address for rent:" + homeAddress);
        System.out.println(" City, State, Zip Code;" + cityStateZip);
        System.out.println(" Owner's phone number:" + phoneNumber);
        System.out.println(" Owner's email address:" + emailAddress);
        System.out.println(" Size apartment for rent:" + sizeApartment);
        System.out.println(" Apartments floor: " + floor);
        System.out.println(" Parking available:" + parking);
        System.out.println(" Type and Style apartment:" + typeStyle);
        System.out.println(" Pets are allowed:" + petsAllow + " each month");
        System.out.println(" Laundry available:" + laundry);
        System.out.println(" Available data:" + dataAvailable);

        double monthlyRent, afterThree, tenDiscount1,monthlyThree;
        int tenDiscount0;

         monthlyRent = 790.99;
         afterThree = monthlyRent * 36;
         tenDiscount0 = 2737;
         tenDiscount1 = afterThree - tenDiscount0;
        monthlyThree =  tenDiscount1;
        System.out.println(" Monthly rent:" + monthlyRent + " $ ");
        System.out.println(" Amount for 3 years:" + afterThree + " $ ");
        System.out.println(" For 3 years, you can get 10% discount which is:" + tenDiscount0);
        System.out.println(" After 10 % discount you will pay " + monthlyThree + " for 3 years ");




    }
}
