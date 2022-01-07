package HomeDo.Tassk_10_26Group;

public class Task2 {

    public static void main(String[] args) {

        /*
        2. Array -- Sort Descending
        Write a return method that can sort an int array in descending order without using the         sort method of the Arrays
         class
        Ex: int[] arr = {10,20,7, 8, 90};
         arr = Sort(arr);==> {90, 20, 10, 8, 7};
         */

        int temp;
        //initializing an array
        int arr[]={10,20,7, 8, 90};
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array elements in descending order:");
         //accessing element of the array
        for (int i = 0; i <= arr.length - 1; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
