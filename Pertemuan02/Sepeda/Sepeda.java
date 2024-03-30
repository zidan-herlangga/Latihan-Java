package Pertemuan02.Sepeda;

public class Sepeda {
    int Kecepatan = 0;
    int Gir = 0;

    // Method
    void ubahGir(int pertambahanGir){
        Gir = Gir + pertambahanGir;
        System.out.println("Gir:" + Gir);
    }

    void tambahKecepatan(int pertambahanKecepetan){
        Kecepatan = Kecepatan + pertambahanKecepetan;
        System.out.println("Kecepatan: " + Kecepatan);
    }
}
