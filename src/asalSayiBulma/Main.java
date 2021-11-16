package asalSayiBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int kontrol = 0;
        int sayi = input.nextInt();
        if (sayi>1 && sayi<100){
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

        }else{
            System.out.println("1 ile 100 arasında bir sayı giriniz ...");
        }

    }
}
