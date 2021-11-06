package kombinasyonHesaplama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 1, r = 1, sayiN, sayiR, sayiF, combinasyon;
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        sayiN = input.nextInt();
        System.out.print("R: ");
        sayiR = input.nextInt();
        /* SayiN faktöriyel hesaplama*/
        for (int i = 1; i <= sayiN; i++) {
            n *= i;
        }
        /* SayiR faktöriyel hesaplama*/
        for (int i = 1; i <= sayiR; i++) {
            r *= i;
        }
        sayiF = sayiN - sayiR;
        for (int j = 1; j <= sayiF; j++) {
            sayiF *= j;
        }
        /* total=(totaln / (totalr * totala)) ;*/

        combinasyon = n / (r * sayiF);
        System.out.println("" + sayiN + " Faktöriyel :" + n);
        System.out.println("" + sayiR + " Faktöriyel :" + r);
        System.out.println("Combinasyon : " + combinasyon);
    }

}