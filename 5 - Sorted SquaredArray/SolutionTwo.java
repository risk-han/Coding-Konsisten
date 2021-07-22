import java.util.*;
import java.io.*;

/**
 * Another efficient solution is based on the two-pointer method as the array is already sorted we can compare the first and last element to check which is bigger and proceed with the result. 
 *  Algorithm – 
 * Initialize left=0 and right=n-1
 * if abs(left) >= abs(right) then store square(arr[left])
 * at the end of result array and increment left pointer
 * else store square(arr[right]) in the result array and decrement right pointer
 * decrement index of result array
*/

public class SolutionTwo {
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
    public static void sortSquares(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        int result[] = new int[n];

        for(int index = n - 1; index >= 0; index--){
            if(Math.abs(arr[left]) > arr[right]){
                result[index] = arr[left] * arr[left];
                left++;
            }else
            {
                result[index] = arr[right] * arr[right];
                right--;
            }
        }
        for(int i = 0; i < n; i++){
            arr[i] = result[i];
        }
    }
}
