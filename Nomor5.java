import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- 5. Kalkulator Sederhana ---");
        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char op = input.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        if ((op == '/' || op == '%') && b == 0) {
            System.out.println("Error: Pembagian atau modulus dengan nol tidak diperbolehkan!");
        } else {
            switch (op) {
                case '+': System.out.println("Hasil: " + (a + b)); break;
                case '-': System.out.println("Hasil: " + (a - b)); break;
                case '*': System.out.println("Hasil: " + (a * b)); break;
                case '/': System.out.println("Hasil: " + (a / b)); break;
                case '%': System.out.println("Hasil: " + (a % b)); break;
                default: System.out.println("Operator tidak valid!"); break;
            }
        }

        input.close();
    }
}