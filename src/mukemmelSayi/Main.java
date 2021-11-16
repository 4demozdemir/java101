package mukemmelSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kontol = 0, sayi = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                kontol += i;
            }
        }
            if (kontol==sayi){
                System.out.println(sayi+" Mükkemmel sayıdır.");
            }else
            {
                System.out.println(kontol+" mükemmel sayı değildir.");
            }

    }
}
