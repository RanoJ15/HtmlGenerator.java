package day29_array;

public class SumNumWithLoop {
    public static void main(String[] args) {

        int [] numberTwo = { 5, 5, 2, 5, 1};
        int sumWithLoop = 0;

        for(int i = 0; i < numberTwo.length; i++){  // i <= numberTwo.length - 1
            sumWithLoop += numberTwo[i];
        }

        System.out.println(sumWithLoop);

    }
}
