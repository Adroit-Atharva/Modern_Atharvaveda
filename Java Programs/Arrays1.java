import java.util.*;

public class Arrays1{
    public static void main(String[] args) {
        // Sample array
        int[] arr = { 5, 2, 9, 1, 7 };

        // Calculate the sum of elements
        int sum = calculateSum(arr);
        System.out.println("Sum of array elements: " + sum);

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Display the sorted array
        System.out.print("Array elements in ascending order: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    // Function to calculate the sum of array elements
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }
}
