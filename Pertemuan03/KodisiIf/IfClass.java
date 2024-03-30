package Pertemuan03.KodisiIf;

public class IfClass {
    public double TotBeli, Potongan;

    public void setTotalBeli(double a){
        TotBeli = a;
    }

    public double getPotongan(){
        if (TotBeli >= 50000) {
            Potongan = 0.2 * TotBeli;
        }
        return Potongan;
    }

    public double JumlahBayar(){
        return (TotBeli - Potongan);
    }
}
