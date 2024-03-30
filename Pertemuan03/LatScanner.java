package Pertemuan03;
import java.util.Scanner;
public class LatScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variable
        String nama;
        int n2;
        double n1, n3;

        System.out.print("Masukan Nama Anda: ");
        nama = scanner.nextLine();

        System.out.print("Masukan Nilai 1: ");
        n1 = scanner.nextDouble();

        System.out.print("Masukan Nilai 2: ");
        n2 = scanner.nextInt();

        n3 = n1 + n2;
        System.out.print("\nNama Anda: " + nama);
        System.out.print("\nNilai Anda: " + n3);

        scanner.close();
    }
}
