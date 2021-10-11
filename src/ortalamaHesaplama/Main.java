package ortalamaHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       int mat,fizik,kimya,turkce,biyoloji;
        double ortalama ;
        String sonuc;

        Scanner input = new Scanner(System.in);
        System.out.println("matematik notunuz :  ");
        mat=input.nextInt();
        System.out.println("Fizik notunuz : ");
        fizik=input.nextInt();
        System.out.println("Kimya  notunuz : ");
        kimya=input.nextInt();
        System.out.println("Türkçe notunuz : ");
        turkce=input.nextInt();
        System.out.println("Biyoloji notunuz :");
        biyoloji=input.nextInt();
        ortalama = (mat + turkce + fizik+kimya+biyoloji) / 6.0;
        System.out.println("Not ortlamanız : " +ortalama);
    System.out.println( sonuc = (ortalama>= 50 )?"geçtiniz ": "Kaldınız.");

    }
}
