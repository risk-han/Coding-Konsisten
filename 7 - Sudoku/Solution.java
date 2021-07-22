import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] Sudoku = new int[n * n][n * n];
        for(int i = 0; i < n * n; i++){
            for(int j = 0; j < n * n; j++){
                Sudoku[i][j] = scan.nextInt(); 
            }
        }
        int sum = n * n;
        int result = 0;
        for(int i = 1; i <= sum; i++){
            result += i;
        }
        
        System.out.println("\nList Sudoku yang anda input adalah : ");
        for(int i = 0; i < n * n; i++){
            for(int j = 0; j < n * n; j++){
                System.out.print(Sudoku[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\nHasil Penjumlahan Row pertama adalah " + result);
        System.out.println("");
    }
}
