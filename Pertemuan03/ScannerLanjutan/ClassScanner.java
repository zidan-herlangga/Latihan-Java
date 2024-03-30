package Pertemuan03.ScannerLanjutan;

import java.util.Scanner;
public class ClassScanner {
    public String Nama;
    public double n1;
    public int n2, n3;
    Scanner input = new Scanner(System.in);

    public String getNama(){
        return Nama;
    }
    
    public void inputScanner(){
        System.out.print("Masukan Nama Anda: ");
        Nama = input.nextLine();

        System.out.print("Masukan Nilai 1: ");
        n1 = input.nextDouble();

        System.out.print("Masukan Nilai 2: ");
        n2 = input.nextInt();
    }

    public double rataRata(){
        return ((n1 + n2) / 2);
    }
}

