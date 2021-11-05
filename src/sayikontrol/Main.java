package sayikontrol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayiG, sayiT = 0,sayac = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz...");
        sayiG = input.nextInt();
        for (int i = 0; i <= sayiG; i++) {
            if ((i % 3 == 0) & (i % 4 == 0)) {
                sayiT = +i;
                sayac++;
                System.out.println("Sayi :" + i);
            }
        }
        System.out.println("Sonuc : " + sayiT + " Sayaç : " + sayac + " Sonuc " + (sayiT / (sayac-1)));
    }

}
