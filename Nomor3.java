import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- 3. Grade & Status Lulus ---");
        System.out.print("Masukkan nilai (0-100): ");
        double nilai = input.nextDouble();

        char grade;
        if (nilai >= 85) {
            grade = 'A';
        } else if (nilai >= 70) {
            grade = 'B';
        } else if (nilai >= 55) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        // Ternary operator
        String status = (nilai >= 55) ? "Lulus" : "Tidak Lulus";

        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);

        input.close();
    }
}