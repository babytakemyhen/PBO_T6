import java.util.Scanner;

public class PhoneCell {
    private int jam = 0;
	private int menit = 0;
	private int detik = 0;


	public PhoneCell durasike(PhoneCell masaDepan) {
		PhoneCell lama = new PhoneCell();
		int lamaDetik = (masaDepan.jam - this.jam) * 3600 +
				(masaDepan.menit - this.menit) * 60 +
				(masaDepan.detik - this.detik);
		lama.jam = lamaDetik / 3600;
		lamaDetik = lamaDetik % 3600;
		lama.menit = lamaDetik / 60;
		lamaDetik = lamaDetik % 60;
		lama.detik = lamaDetik;
		return lama;
	}

	public static void main(String[] args) {
        System.out.println("Program Penghitung Biaya dan Durasi Percakapan");
        Scanner input = new Scanner(System.in);

        PhoneCell mulai = new PhoneCell();
        System.out.print("Waktu mulai ->   jam: ");
        mulai.jam = input.nextInt();
        System.out.print("               menit: ");
        mulai.menit = input.nextInt();
        System.out.print("               detik: ");
        mulai.detik = input.nextInt();

        PhoneCell selesai = new PhoneCell();
        System.out.print("Waktu selesai ->   jam: ");
        selesai.jam = input.nextInt();
        System.out.print("                 menit: ");
        selesai.menit = input.nextInt();
        System.out.print("                 detik: ");
        selesai.detik = input.nextInt();

        if (selesai.jam < mulai.jam) {
            System.out.println("Program ini hanya bekerja pada hari yang sama. " +
                    "Silakan input waktu selesai dengan benar.");
        } else {
            PhoneCell lama = mulai.durasike(selesai);
            System.out.println("Lama waktu/durasi: " +
                    lama.jam + " jam " +
                    lama.menit + " menit " +
                    lama.detik + " detik");
            int lamaDurasi = (lama.jam * 3600) + (lama.menit * 60) + lama.detik;
            System.out.println("Biaya : Rp" + lamaDurasi * 30);
        }
    }
}
