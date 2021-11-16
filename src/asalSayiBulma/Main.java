package asalSayiBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int kontrol = 0;
        int sayi = input.nextInt();

        for (int i = 2; i < sayi; i++) {
            if (sayi%i == 0) {
                kontrol++;
            }

        }
        if (kontrol==0){
            System.out.println("Asal sayıdır ");
        }else{
            System.out.println("Asal sayı değildir. ");
        }

    }
}
