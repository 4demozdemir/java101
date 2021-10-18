package kdvHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       double priceFirst,kdv,priceLast;
       System.out.println("Fiyat girin lütfen");
        priceFirst= input.nextInt();
       if(priceFirst<1000){
           kdv= priceFirst * 0.18;

       }else
       {
           kdv= priceFirst *0.8;

       }
       priceLast= priceFirst+kdv;
       System.out.println("Kdv'siz Fiyat : " +priceFirst);
            System.out.println("kdv : "+ kdv);
        System.out.println("Kdv'siz Fiyat : " +priceLast);

    }

}
