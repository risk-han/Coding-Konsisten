import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valueAwal = 1;
        int selisihAwal = 2;

        int banyakDeret = input.nextInt();

        for(int i = 0; i < banyakDeret; i++){
            System.out.println(valueAwal);
            valueAwal += selisihAwal;
            selisihAwal++;
        }
    }
}

// 6
// 1, 3, 6, 10 ,15 ,21
//  2  3   4  5  6
// n = n + 1

//Set valueAwal = 1
//Set selisihAwal = 2
//for loop => inputan
//inputan = 6
//print(valueAwal)
//valueAwal += selisihAwal
//selisihAwal++
