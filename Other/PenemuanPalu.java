import java.util.Scanner;

public class PenemuanPalu {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println(x >= y ? "YES" : "NO");
    }
}
