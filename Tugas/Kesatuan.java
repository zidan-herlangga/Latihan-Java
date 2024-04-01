import java.util.Scanner;

public class Kesatuan {
    public static void main(String[] args){
        // Deklarasi variable
        String nama, nim;
        double n_absen, n_tugas, n_uts, n_uas, rata_rata;
        
        // Membuat objek input
        Scanner input = new Scanner(System.in);

        System.out.println("\n== Program Dasar Java Input ==");
        System.out.println("==============================");
    
        System.out.print("Masukan Nama Mahasiswa: ");
        nama = input.nextLine();
    
        System.out.print("Masukan NIM Mahasiswa: ");
        nim = input.nextLine();
    
        System.out.print("Masukan Nilai Absen: ");
        n_absen = input.nextDouble();
    
        System.out.print("Masukan Nilai Tugas: ");
        n_tugas = input.nextDouble();
    
        System.out.print("Masukan Nilai UTS: ");
        n_uts = input.nextDouble();
    
        System.out.print("Masukan Nilai UAS: ");
        n_uas = input.nextDouble();
            
        rata_rata = (0.1 * n_absen) + (0.2 * n_tugas) + (0.3 * n_uts) + (0.4 * n_uas);

        System.out.println("\n== Program Dasar Java Input ==");
        System.out.println("==============================");
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("NIM Mahasiswa   : " + nim);
        System.out.println("Nilai Absen     : " + n_absen);
        System.out.println("Nilai Tugas     : " + n_tugas);
        System.out.println("Nilai UTS       : " + n_uts);
        System.out.println("Nilai UAS       : " + n_uas);
        System.out.println("==============================");
        System.out.println("Rata-Rata       : " + rata_rata);
            
        input.close();
    }
} 