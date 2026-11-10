import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- 4. Nama Hari ---");
        System.out.print("Masukkan angka hari (1-7): ");
        int hariAngka = input.nextInt();
        String namaHari;

        switch (hariAngka) {
            case 1: namaHari = "Senin"; break;
            case 2: namaHari = "Selasa"; break;
            case 3: namaHari = "Rabu"; break;
            case 4: namaHari = "Kamis"; break;
            case 5: namaHari = "Jumat"; break;
            case 6: namaHari = "Sabtu"; break;
            case 7: namaHari = "Minggu"; break;
            default: namaHari = "Angka tidak valid! Masukkan 1 - 7."; break;
        }

        System.out.println("Hari: " + namaHari);

        input.close();
    }
}