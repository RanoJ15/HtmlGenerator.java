package day15_Switch_Statement;

public class NestedExample {

    public static void main(String[] args) {

        boolean b = false;
        boolean c = true;

        if(b){

            System.out.println(1);

            if(!b){
                System.out.println(3);
            } else {
                System.out.println(2);
            }

            if(c){
                System.out.println(3);
            } else{
                System.out.println(4);
            }

        } else {
            System.out.println(5);

            if(4 > 5){
                System.out.println(6);
            } else {
                System.out.println(7);
            }
        }

    }
}
