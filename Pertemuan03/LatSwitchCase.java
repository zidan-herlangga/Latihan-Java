package Pertemuan03;

import java.util.*;
 
public class LatSwitchCase {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kb;
        String nb = "";

        System.out.print("Masukan kode [1, 2, 3]: ");
        kb = scanner.nextInt();

        switch (kb) {
            case 1:
                nb = "Alat Olahraga";
                break;
            case 2:
                nb = "Alat Masak";
                break;
            case 3:
                nb = "Alat Tulis Kantor";
                break;
            default:
                nb = "Anda salah kode!";
                break;
            }
            System.out.println("\nNama barang: " + nb);
        scanner.close();
    }    
}
