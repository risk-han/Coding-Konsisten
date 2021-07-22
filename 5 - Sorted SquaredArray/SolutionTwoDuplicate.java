import java.io.*;

public class SolutionTwoDuplicate {
    public static void main(String[] args) {
        
    }

    public static void sortSquares(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        int result[] = new int[n];

        for(int index = n - 1; index >= 0; index--){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
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
