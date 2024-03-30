package Pertemuan03.IfElseLanjutan;

public class IfElseAksi {
    public static void main(String[] args) {
        IfElseClass ifClass = new IfElseClass();

        ifClass.setInputData();
        ifClass.getKeterangan();
        System.out.println("\nHasil Akhir");
        System.out.println("=================================================");
        System.out.println("Nama siswa:                        " + ifClass.nama);
        System.out.println("Nilai siswa:                       " + ifClass.nilaiAkhir);
        System.out.println("Keterangan siswa:                  " + ifClass.getKeterangan());
        System.out.println("=================================================");
    }
}
