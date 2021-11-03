package ucakBiletFiyat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age, km, flightType;
        double price = 0, discount = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı giriniz");
        age = input.nextInt();
        System.out.print("Mesafe giriniz");
        km = input.nextInt();
        System.out.print("Yolculuk tipi giriniz");
        flightType = input.nextInt();

        if (km > 0) {
            price = km * 0.10;
        } else System.out.println("Hatalı Veri Girdiniz ! ");
        System.out.println(" Tutar : " + price);

        if (age > 0) {
            if (age < 12) {
                discount = price * 0.5;
            } else if (age < 25 && age > 12) {
                discount = price * 0.1;
            } else if (age > 65) {
                discount = price * 0.30;
            }
        } else System.out.println("Hatalı Veri Girdiniz ! ");

        System.out.println("İndirim :: : " + discount);
        price = price - discount;


        if (flightType > 0 && flightType < 3) {
            if (flightType == 2) {
                discount = price * 0.20;
            }

        } else System.out.println("Hatalı Veri Girdiniz ! ");

        price = price - discount;

        System.out.println("Toplam Tutar : " + price);

    }
}