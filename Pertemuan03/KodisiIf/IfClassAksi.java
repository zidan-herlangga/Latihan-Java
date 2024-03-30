package Pertemuan03.KodisiIf;
import java.util.Scanner;

public class IfClassAksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IfClass fungsiIf = new IfClass();

        System.out.print("Total Pembelian Rp.");
        fungsiIf.TotBeli = scanner.nextDouble();

        System.out.println("Besar Potongan Rp. " + fungsiIf.Potongan);
        System.out.println("Jumlah yang harus dibayar Rp. " + fungsiIf.JumlahBayar());

        scanner.close();
    }
}
