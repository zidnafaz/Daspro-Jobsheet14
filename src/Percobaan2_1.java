import java.util.Scanner;

public class Percobaan2_1 {

    static int hitungPangkat(int x, int y) {

        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }

    }

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int bilangan, pangkat;
        
        System.out.print("Bilangan yang dihitung : ");
        bilangan = input18.nextInt();
        System.out.print("Pangkat                : ");
        pangkat = input18.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));

        int hasil = hitungPangkat(bilangan, pangkat);

        System.out.print(bilangan);
        for (int i = 1; i < pangkat; i++) {
            System.out.print("x" + bilangan);
        }
        System.out.print("x1 = " + hasil);
    }
}
