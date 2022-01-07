package day7_unary_operators;

public class Store {

    public static void main(String[] args) {

        String storeName = "Target" ;
        int numberOfTvs = 100;

        System.out.println("Person came into the store and bought a TV");
        System.out.println("Number of TVs now:" + --numberOfTvs);

        System.out.println("Person came into the store and bought a TV");
        System.out.println("Number of TVs now:" + --numberOfTvs);

        System.out.println("Person came into the store and put aTV into the cart");
        System.out.println("Number of TVs  in the store  is still: " + numberOfTvs--);
        System.out.println("Then buy everything and leave:" + numberOfTvs);

        System.out.println("shipment of TVs comes");
        // numberOfTvs++
        // numberOfTvs++
        // numberOfTvs++
        //47 more line
        numberOfTvs = numberOfTvs + 53; //reassigned
        System.out.println(" some with big bucks comes in and buys 5 TVs");
        numberOfTvs = numberOfTvs -5;
        // numberOfTvs ++ <-same-> numberOfTvs = numberOfTvs + 1;
        System.out.println(numberOfTvs); //145 TV















    }
}
