import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- 2. Positif / Negatif / Nol ---");
        System.out.print("Masukkan angka: ");
        double angka = input.nextDouble();

        if (angka > 0) {
            System.out.println("Positif");
        } else if (angka < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Nol");
        }

        input.close();
    }
}