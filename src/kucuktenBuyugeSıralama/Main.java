package kucuktenBuyugeSıralama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int s1,s2,s3;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı değerini giriniz ");
        s1=input.nextInt();
        System.out.println("Sayı değerini giriniz ");
        s2=input.nextInt();
        System.out.println("Sayı değerini giriniz ");
        s3=input.nextInt();

        if (s1>s2 && s1>s3){
            if (s2>s3){
                System.out.println("Sıralama --> "+s3+" "+s2+" "+s1);
            }
            if (s3>s2){
                System.out.println("Sıralama --> "+s3+" "+s3+" "+s1);
            }
        }
        if (s2>s1 && s2>s3){
            if (s1>s3){
                System.out.println("Sıralama --> "+s3+" "+s1+" "+s2);
            }
            if (s3>s1){
                System.out.println("Sıralama --> "+s1+" "+s3+" "+s2);
            }
        }
        if (s3>s2 && s3>s1){
            if (s2>s1){
                System.out.println("Sıralama --> "+s1+" "+s2+" "+s3);
            }
            if (s1>s2){
                System.out.println("Sıralama --> "+s2+" "+s1+" "+s1);
            }
        }

    }
}
