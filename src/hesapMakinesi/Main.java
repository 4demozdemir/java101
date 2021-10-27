package hesapMakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int s1,s2,select;
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz : ");
        s1=input.nextInt();
        System.out.println("2. sayıyı giriniz : ");
        s2=input.nextInt();
        System.out.println("Hangi işlemi yapmak istersiniz . \n1- toplama  \n 2- Çıkarma \n 3- Çarpma \n 4- Bölme");
        select=input.nextInt();
        if (select<1 || select>4 ){
            System.out.println("Böyle bir işlem bulunmamaktadır.");
        }
        switch (select){
            case 1:
              System.out.print("Sonuc "+ (s1+s2));
              break;
            case 2:
                System.out.print("Sonuc "+ (s1-s2));
                break;
            case 3 :
                System.out.print("Sonuc "+ (s1*s2));
                break;
            case 4 :
                System.out.print("Sonuc "+ (s1/s2));
                break;
        }

    }
}
