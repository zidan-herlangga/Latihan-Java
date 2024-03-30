package Pertemuan02;

public class OptLogika {
    public static void main(String[] args) {
        System.out.println("Operator AND");
        System.out.println("True & True  = " + (true & true));
        System.out.println("True & False = " + (true & false));
        System.out.println("False & True = " + (false & true));
        System.out.println("False & True = " + (false & false));

        System.out.println("Operator OR");
        // System.out.println("True || True  = " + (true || true));
        // System.out.println("True || False = " + (true || false));
        System.out.println("False || True = " + (false || true));
        System.out.println("False || True = " + (false || false));

        System.out.println("Operator XOR");
        System.out.println("True ^ True  = " + (true ^ true));
        System.out.println("True ^ False = " + (true ^ false));
        System.out.println("False ^ True = " + (false ^ true));
        System.out.println("False ^ True = " + (false ^ false));

        System.out.println("Operator NOT");
        System.out.println("!True = " + (!true));
        System.out.println("!False = " + (!false));
    }
}
