import java.util.Scanner; 

class Solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();

        if(angka % 2 == 0 && angka <= 1){
            System.out.println("NO");
        }else if(angka < 7){
            System.out.println("YES");
        }else if(angka > 100 || angka <= 1){

        }else{
            System.out.println("NO");
        }
    }
}
