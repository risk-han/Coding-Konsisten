import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Baris = input.nextInt();
        int Kolom = input.nextInt();

        for(int i = 0; i < Baris; i ++){
            for(int j = 0; j < Kolom; j++){
                if(Baris % 2 == 0){
                    System.out.println("B");
                }else{
                    System.out.println("W");
                }
            }
        }
    }
}

