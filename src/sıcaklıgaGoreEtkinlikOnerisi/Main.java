package sıcaklıgaGoreEtkinlikOnerisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Merhaba gençler");
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz : ");
        heat = input.nextInt();
        if(heat<5){
            System.out.println("Kayak yapabilirsin...");
        }else if(heat>5 && heat<25){
            if (heat<=15) {
                System.out.println("Sinemaya gidebilirsin...");
            }
            if (heat>=10){
                System.out.println("Pikniğe gidebilirsin...");
            }
        }
        else if(heat>=25){
            System.out.println("Yüzmeye gidebilirsin...");
        }
    }
}
