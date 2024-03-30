package Pertemuan02;

public class OptPembanding {
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        boolean aa, bb, cc, dd, ee, ff;

        a = 5;
        b = 6;
        c = 3;
        d = 9;
        e = 8;
        f = 2;

        aa = a == b;
        bb = b > c;
        cc = c < d;
        dd = d >= e;
        ee = e <= f;
        ff = b != a;

        System.out.println("Apakah"+ a + " == " + b +"? Jawabannya " + aa);
        System.out.println("Apakah"+ b + " > " + c +"? Jawabannya " + bb);
        System.out.println("Apakah"+ c + " < " + d +"? Jawabannya " + cc);
        System.out.println("Apakah"+ d + " >= " + e +"? Jawabannya " + dd);
        System.out.println("Apakah"+ e + " <= " + f +"? Jawabannya " + ee);
        System.out.println("Apakah"+ b + " != " + a +"? Jawabannya " + ff);
    }
}
