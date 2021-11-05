package sayiKuvvetKontrol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz  : ");
        sayi=input.nextInt();
        for (int i = 0 ; i<=sayi ;i++){
            System.out.println("4'ün "+i+". katı : "+(i*4) + "        5'in "+i+". katı : "+(i*5));
        }
        System.getLogger("İşlem tamamlandı ...");
    }
}
