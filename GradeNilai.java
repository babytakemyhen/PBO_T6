import java.util.Scanner;

public class GradeNilai {
  private double nilai;

    public GradeNilai(){
        this.nilai = 0;
    }
    public void setNilai(double nilai){
        this.nilai = nilai;
    }
    public double getNilai(){
        return this.nilai;
    }

    public double Hitung(){
        double hitung;
        hitung = this.nilai;
        if ((nilai >=87) && (nilai <=100)){
                System.out.println("Nilai Huruf= A");
            }
            else if ((nilai <87) && (nilai >=76)){
                System.out.println("Nilai Huruf= B");
            }
            else if ((nilai <76)&&(nilai >=66)){
                System.out.println("Nilai Huruf= C");
            }
            else if((nilai <66)&&(nilai >=56)){
                System.out.println("Nilai Huru= D");
            }
            else if((nilai <56)&& (nilai >=0)) {
            System.out.println("Nilai Huruf= E");
            }
        return hitung;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeNilai obj = new GradeNilai();
        System.out.println("Masukkan total nilai : ");
        obj.nilai = input.nextDouble();
        System.out.println("Hasil : ");
        System.out.println("Nilai Angka = "+obj.nilai);
        obj.Hitung();
    }
}
