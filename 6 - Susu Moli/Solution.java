import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        int N = 0;
        int A = 0;
        int B = 0;
        int K = 0;
        int sum[] = new int[T];

        for(int i = 0; i < T; i++){
            N = input.nextInt();
            A = input.nextInt();
            B = input.nextInt();
            K = input.nextInt();

            sum[i] = N + (K * (B - A));
        }
        
        for(int i = 0; i < sum.length; i++){
            System.out.println("Kasus #" + (i + 1) + ": " + sum[i]);
        }
    }
}
