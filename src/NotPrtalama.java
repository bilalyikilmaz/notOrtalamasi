import java.sql.SQLOutput;
import java.util.Scanner;

public class NotPrtalama {
    public static void main(String[] args) {
    // Değişkenler
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan Değerleri Al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih  = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam/6;

        if (ortalama < 60) {
            System.out.println("sınıfta kaldınız.. :(");
        } else {
            System.out.println("sınıfı geçtiniz.. :)");
        }
        System.out.print("ortalamanız: " + ortalama);

    }
}
