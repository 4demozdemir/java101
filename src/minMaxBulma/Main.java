package minMaxBulma;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı girilecek : ");
        int n = input.nextInt();
    int [] dizi= new int[n];
        for (int i = 0 ;i<n;i++){
            System.out.print(i+1 +". Sayıyı giriniz : ");
            dizi[i]=input.nextInt();
        }
            Arrays.sort(dizi);
            System.out.println("En küçük : "+dizi[0]);
            System.out.print("En büyük :"+dizi[n-1]);

    }
}
