import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- 6. Jenis Segitiga ---");
        System.out.print("Masukkan panjang sisi a: ");
        double s1 = input.nextDouble();
        System.out.print("Masukkan panjang sisi b: ");
        double s2 = input.nextDouble();
        System.out.print("Masukkan panjang sisi c: ");
        double s3 = input.nextDouble();

        // Syarat pertidaksamaan segitiga
        if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)) {
            if (s1 == s2 && s2 == s3) {
                System.out.println("Segitiga Sama Sisi");
            } else if (s1 == s2 || s2 == s3 || s1 == s3) {
                System.out.println("Segitiga Sama Kaki");
            } else {
                System.out.println("Segitiga Sembarang");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }

        input.close();
    }
}