package dizideMinMaxBulma;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] myList = {56, 34, 1, 8, 101, -2, -33};

        Scanner num = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = num.nextInt();

        int min = number, max = number;
           /* 5 */

        for (int i : myList) {
            if (i > number) {
                if (number == max || i < max) {
                    max = i;
                }
            } else {
                if (number == min || i > min) {
                    min = i;
                }
            }
        }

        String list = Arrays.toString(myList);
        System.out.println("Dizi: " + list);
        System.out.println("Girilen Sayı: " + number);
        System.out.println("Sayıya yakın küçük sayı: " + min);
        System.out.println("Sayıya yakın büyük sayı: " + max);


    }
}

