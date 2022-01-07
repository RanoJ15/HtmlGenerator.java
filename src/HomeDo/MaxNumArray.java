package HomeDo;

public class MaxNumArray {
//*Q10:Array -- Find Minimum: Write a method that can find the maximum number from an int Array.
    // *Q9:Array -- Find Maximum:  Write a method that can find the maximum number from an int Array.

    static int[] arr = {10, 324, 45, 90, 9808};

    // Method to find maximum in arr[]
    static int largest() {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    // Driver method
    public static void main(String[] args) {
        System.out.println(largest());
    }
}
