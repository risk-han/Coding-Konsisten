import java.util.Scanner;

public class Persegidalampersegi {
    public static void main(String[] args){
        int a,sum = 0, count = 1;

        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        
        while(count <= a)
        {
            sum = sum + (count * count);
            count++;
        }

        System.out.println(sum);

    }
}
