package HomeDo.InterviewQuestions;

import java.util.Arrays;

public class integersNumsAndTarget {

    public static void main(String[] args) {
        int [] numbers = {2,7,11,5};
        int  target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }


    public static int[] twoSum(int[] numbers, int target) {


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (target == (numbers[i] + numbers[j])) {
                    return new int[]{i, j};

                }
            }
        }
        return new int[] {};


    }

}
/*
    /**
     * Given an array of integers nums and an integer target,
      return indices of the two numbers such that they add up to target.
       You may assume that each input would have exactly one solution,
       and you may not use the same element twice. You can return the answer
       in any order. Example 1: Input: nums = [2,7,11,15], target = 9 Output: [0,1]
       Output: Because nums[0] + nums[1] == 9, we return [0, 1] Should only use one loop.
    */
















