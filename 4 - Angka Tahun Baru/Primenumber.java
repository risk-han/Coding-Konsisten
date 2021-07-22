import java.util.Scanner; 
import java.lang.Math;

class Primenumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();

        if(angka % 2 == 0){
            System.out.println("NO");
        }else if(angka <= 1){
            System.out.println("NO");
        }else if(angka < 7 ){
            System.out.println("YES");
        }else{
            System.out.println("YES");
        }
        for(int i = 2; i <= Math.sqrt(angka); i++){
            if(angka % i == 0){
                System.out.println("NO");
            }
        }
    }
}
