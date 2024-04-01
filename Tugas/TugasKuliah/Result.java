package TugasKuliah;

public class Result {
    
    public static void main(String[] args){

        TugasInput main = new TugasInput();

        main.setInputData();
        main.getHasil();

        System.out.println("\n== Program Dasar Java Input ==");
        System.out.println("==============================");
        System.out.println("Nama Mahasiswa  : " + main.nama);
        System.out.println("NIM Mahasiswa   : " + main.nim);
        System.out.println("Nilai Absen     : " + main.n_absen);
        System.out.println("Nilai Tugas     : " + main.n_tugas);
        System.out.println("Nilai UTS       : " + main.n_uts);
        System.out.println("Nilai UAS       : " + main.n_uas);
        System.out.println("==============================");
        System.out.println("Rata-Rata       : " + main.getHasil());

        main.closeScanner();
    }
}

// Uji Coba Syntax
// package TugasKuliah;

// public class Result {
//     public static void main(String[] args){
//         TugasInput hasil = new TugasInput();

//         hasil.inputData();
//         System.out.println("Nama Anda: " + hasil.nama);

//         hasil.closeScanner();
//     }
// }