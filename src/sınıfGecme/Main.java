package sınıfGecme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sınıfı geçme durum hesaplama programı");
        int matematik, fizik, kimya, turkce, muzik;
        double ortalama = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notu : ");
        matematik = input.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            ortalama = ortalama + matematik;
        }
        System.out.println("Fizik notu : ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            ortalama = ortalama + fizik;
        }

        System.out.println("Kimya notu : ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            ortalama = ortalama + kimya;
        }
        System.out.println("Türkçe notu : ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            ortalama = ortalama + turkce;
        }
        System.out.println("Müzik notu : ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            ortalama = ortalama + muzik;
        }
        ortalama = ortalama / 5;
        if (ortalama > 55) {
            System.out.println("Tebrikler geçtiniz ortalamanı : "+ ortalama);
        } else {
            System.out.println("Malasef geçemediniz ortalamanız : "+ortalama);
        }

    }
}
