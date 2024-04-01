/*
 * Author Zidan Herlangga
 */

package TugasKuliah;
import java.util.Scanner;

public class TugasInput {

    public String nama, nim;
    public double n_absen, n_tugas, n_uts, n_uas, rata_rata;
    
    Scanner input = new Scanner(System.in);

    public void setInputData(){
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
    }
    
    public void closeScanner(){
        input.close();
    }
    
    public double getHasil(){
        rata_rata = (0.1 * n_absen) + (0.2 * n_tugas) + (0.3 * n_uts) + (0.4 * n_uas);

        return rata_rata;
    }
} 

// Uji coba syntax
// package TugasKuliah;

// import java.util.Scanner;

// public class TugasInput {
//     public String nama;
//     Scanner scanner = new Scanner(System.in);

//     public void inputData(){
//         System.out.print("Masukan Nama: ");
//         nama = scanner.nextLine();
//     }

//     public void closeScanner(){
//         scanner.close();
//     }
// }