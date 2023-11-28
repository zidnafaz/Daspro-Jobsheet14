import java.util.Scanner;

public class Percobaan3 {
    static double HitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return  (1.11 * HitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int tahun;
        double saldoAwal;

        System.out.print("Jumlah saldo awal         : ");
        saldoAwal = input18.nextInt();
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = input18.nextInt();
        
        System.out.print("Jumlah saldo setelah" + tahun + " tahun : ");
        System.out.print(HitungLaba(saldoAwal, tahun));
    }
}