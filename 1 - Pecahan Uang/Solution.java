import java.util.Scanner; 

class Solution{
    public static void main(String[] args) {
        int daftarKoin[] = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner input = new Scanner(System.in);

        int jumlahUang = input.nextInt();

        for(int listKoin : daftarKoin){
            int jumlahKoin = 0;
            while(jumlahUang - listKoin >= 0){
                jumlahUang -= listKoin;
                jumlahKoin++;
                
            }
            if(jumlahKoin > 0){
                System.out.println(listKoin + " " + jumlahKoin);
            }

        }

    }
}


