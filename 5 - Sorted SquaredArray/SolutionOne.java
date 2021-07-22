import java.util.*;
import java.io.*;

/**
 * Simple Solution is to first convert
 * each array element into its square and
 * then apply sorting algorithm to sort
 * the array elements.
 * Time complexity: O(n log n)
 */

 /**
  * Given an array of both positive and 
    negative integers ‘arr[]’ which are sorted.
    The task is to sort the square of 
    the numbers of the Array.
  * Examples: 
  * Input  : arr[] =  {-6, -3, -1, 2, 4, 5}
  * Output : 1, 4, 9, 16, 25, 36 
  * Input  : arr[] = {-5, -4, -2, 0, 1}
  * Output : 0, 1, 4, 16, 25

  */


class SolutionOne {
    // Function to sort an square array
    public static void sortSquares(int arr[])
    {
        int n = arr.length;
 
        // First convert each array elements
        // into its square
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] * arr[i];
 
        // Sort an array using "inbuild sort function"
        // in Arrays class.
        Arrays.sort(arr);
    }
 
    // Driver program to test above function
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan banyaknya size array");
        int n = input.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Masukkan nilai array ke-" + (i + 1));
            arr[i] = input.nextInt();
        }
 
        System.out.println("List Array Sebelum SortSquare : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
 
        sortSquares(arr);
        System.out.println("");
        System.out.println("List Array Sesudah SortSquare : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}