import java.util.*;
import java.io.*;

public class SolutionOneDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan banyaknya size array");
        int n = input.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i ++){
            System.out.println("Masukkan nilai array ke - " + (i + 1));
            arr[i] = input.nextInt();
        }

        System.out.println("List Array sebelum sortsquare : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

            sortSquares(arr);
            System.out.println("\n");
            System.out.println("List Array Sesudah SortSquare : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortSquares(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            arr[i] = arr[i] * arr[i];
        }

        Arrays.sort(arr);
    }
}
