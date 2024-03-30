package Pertemuan03;
import java.util.Scanner;

public class IfElseMajemuk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pendapatan;
        double jasa, komisi, total;

        System.out.print("Masukan pendapatan Rp. ");
        pendapatan = scanner.nextInt();

        if (pendapatan >= 0 && pendapatan <= 200000){
            jasa = 10000;
            komisi = 0.1 * pendapatan;
        } 
        else if (pendapatan <= 500000){
            jasa = 20000;
            komisi = 0.15 * pendapatan;
        }
        else {
            jasa = 30000;
            komisi = 0.2 * pendapatan;
        }

        total = komisi + jasa;
        System.out.println("\nUang Jasa Rp. " + (int) jasa);
        System.out.println("Uang Komisi Rp. " + (int) komisi);
        System.out.println("========================================");
        System.out.println("Uang Total Rp. " + (int) total);

        scanner.close();
    }
}
