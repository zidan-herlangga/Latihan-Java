package Pertemuan03.IfElseLanjutan;
import java.util.Scanner;;

public class IfElseClass {
    public String nama, ket;
    public int nilaiAkhir;
    Scanner scanner = new Scanner(System.in);

    public void setInputData(){
        System.out.print("Masukan nama siswa: ");
        nama = scanner.nextLine();

        System.out.print("Masukan nilai: ");
        nilaiAkhir = scanner.nextInt();
    }

    public String getKeterangan(){
        if (nilaiAkhir >= 70){
            ket = "Lulus";
        } else {
            ket = "Tidak Lulus";
        }

        return ket;
    }
}
