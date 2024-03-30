package Pertemuan03.IfElse;
import java.util.Scanner;

public class LatIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama, keterangan;
        int nilai;

        System.out.print("Masukan nama siswa: ");
        nama = scanner.nextLine();
        System.out.print("Masukan nilai akhir: ");
        nilai = scanner.nextInt();

        if (nilai > 70) {
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak Lulus";
        }

        System.out.println("Hasil Akhir");
        System.out.println("=================================================");
        System.out.println("Nama siswa:                        " + nama);
        System.out.println("Nilai siswa:                       " + nilai);
        System.out.println("Keterangan siswa:                  " + keterangan);
        System.out.println("=================================================");

        scanner.close();
    }
}
