package Pertemuan03.ScannerLanjutan;

public class AksiScanner {
    public static void main(String[] args) {
        // Membuat object baru
        ClassScanner scan = new ClassScanner();

        scan.inputScanner();
        System.out.println("\nNama Anda : " + scan.getNama());
        System.out.println("Nilai Anda : " + scan.rataRata());
    }
}
