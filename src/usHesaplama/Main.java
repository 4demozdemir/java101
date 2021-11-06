package usHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int us, sayi, total = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();
        System.out.print("Üssünü giriniz: ");
        us = input.nextInt();
        for (int i = 1; i <= us; i++) {
            total *= sayi;
        }
        System.out.println(sayi + " sayısının " + us + ". üssü : " + total);
    }
}
