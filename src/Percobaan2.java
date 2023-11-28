import java.util.Scanner;

public class Percobaan2 {

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
    }
}
