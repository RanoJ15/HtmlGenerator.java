package HomeDo.Task_10_08_Group;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatArray<array1> {

    public static void main(String[] args) {

        /*
        1. Array - Concat two arrays
         Write a return method that can concate two arrays

         */
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int newArr = array1.length + array2.length;

        int[] result = new int[newArr];//length 6
        int arr = 0;//position
        for (int each : array1) {
            result[arr] = each;
            arr++;
        }

        for (int each : array2) {
            result[arr] = each;
            arr++;
        }

        System.out.println(Arrays.toString(result));



        String[] arr3 = {"A", "B", "C","D","E"};
        String[] arr4 = {"F", "J", "H","G","K"};

        ArrayList<String> list = new ArrayList<>(); //[A, B, C, D, E, F, J, H, G, K]

        for( String each: arr3 ){
            list.add( each );
        }
        for(String each1 : arr4  ){
            list.add(each1);
        }
        System.out.println(list); // [A, B, C, D, E, F, J, H, G, K]


        /*
        Concat two arrays:

public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

    int[] result = new int[arr1.length + arr2.length];

    int i = 0;

    for(int each: arr1) {

    result[i] = each;

    i++;

    }

    for(int each: arr2) {

    result[i] =each;

    i++;

    }

    return result;

    }
         */
    }


}







