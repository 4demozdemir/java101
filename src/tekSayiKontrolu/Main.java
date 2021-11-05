package tekSayiKontrolu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi = 0, toplam = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Bir sayı giriniz :");
            sayi = input.nextInt();
            if ((sayi & 2) == 0 && (sayi % 4) == 0) {
                toplam = toplam+sayi;
            }
        } while (sayi % 2 != 1);

        System.out.println("Toplam" + toplam);
    }
}
