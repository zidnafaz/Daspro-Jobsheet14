import java.util.Scanner;

public class Tugas2_18 {
    public static int penjumlahanRekursif(int n) {

        if (n <= 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
        
    }
     public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.print("Masukkan nilai f : ");
        int f = input18.nextInt();

        int hasil = penjumlahanRekursif(f);

        System.out.println("Penjumlahan dari 1 sampai " + f + " adalah : " + hasil);

        input18.close();
    }
}