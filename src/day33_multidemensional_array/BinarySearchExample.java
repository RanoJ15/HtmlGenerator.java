package day33_multidemensional_array;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int[] nums = {1,55,100,200};

        System.out.println(Arrays.binarySearch(nums,55));
        System.out.println(Arrays.binarySearch(nums,200));
        System.out.println(Arrays.binarySearch(nums,30));//-5
        System.out.println(Arrays.binarySearch(nums,49));//-5

        Arrays.sort(nums);

        System.out.println(Arrays.binarySearch(nums,30));// 3

        System.out.println();

        int[] nums2 = {-5,-3,-2,10,20};
        int indexOfNeg = Arrays.binarySearch(nums2, -5);

        System.out.println(indexOfNeg);
    }
}
