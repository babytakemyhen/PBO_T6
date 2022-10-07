import java.util.Scanner;

class Segitiga {
    private int alas;
    private int tinggi;

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Segitiga segitiga = new Segitiga();

        System.out.println("Masukan alas segitiga: ");
        segitiga.setAlas(sc.nextInt());

        System.out.println("Masukan tinggi segitiga: ");
        segitiga.setTinggi(sc.nextInt());

        System.out.println("Luas segitiga: " + segitiga.hitungLuas());
        sc.close();

    }
}
