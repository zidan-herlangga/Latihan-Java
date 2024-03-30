package Pertemuan03;
import java.io.*;

public class LatBuffered {
    public static void main(String[] args) throws IOException {
        // Membuat object baru
        InputStreamReader keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyreader);
        
        // Deklarasi variable
        String kata_1;
        String kata_2;
        // import java.io.BufferedReader.readLine() throws IOException

        System.out.println("Masukan kata 1: ");
        kata_1 = input.readLine();
        
        System.out.println("Masukan kata 2: ");
        kata_2 = input.readLine();
        
        System.out.print("Hasil input String: " + kata_1 + " " + kata_2);
    }
}
