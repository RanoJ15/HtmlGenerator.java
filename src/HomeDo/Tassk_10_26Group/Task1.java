package HomeDo.Tassk_10_26Group;

public class Task1 {
    public static void main(String[] args) {/*
        1.Array -- Sort Ascending
         Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays          class
          Ex:
         int[] arr = {10, 9, 8, 7};
          arr = Sort(arr);==>{ 7, 8, 9, 10};
         */

        //creating an instance of an array
        int[] arr = new int[] {10, 9, 8, 7};
        System.out.println("Array elements after sorting:");
        //sorting logic
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                int tmp = 0;
                if (arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            //prints the sorted element of the array
            System.out.println(arr[i]);


        }
    }
}















 /*



4. Array -- Permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters.

5. Array -- Move zeros to the end
- Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)

  */

