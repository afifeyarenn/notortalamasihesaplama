package giris;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        int mat , fizik , kimya , turkce , muzik , tarih;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz:");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce = inp.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik = inp.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih = inp.nextInt();

        int toplam = (mat + fizik + kimya + tarih + turkce + muzik);
        double ortalama = toplam / 6.0;

        System.out.println("Ortalamanız:" + ortalama);

        String sonuc = (ortalama>=60)? "Geçti" : "Kaldı";

        System.out.print(sonuc);




    }
}
