package manavKasaProgramı;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        double elma,armut,domates,muz,patlican,toplam;
        double elmaF=3.67,armutF=2.14 ,domatesF=1.11,muzF=0.95,patlicamF=5.00;
        Scanner input = new Scanner(System.in);

        System.out.println("Elma kaç kilo ?");
        elma=input.nextDouble();
        System.out.println("Armut kaç kilo ? ");
        armut=input.nextDouble();
        System.out.println("Muz kaç kilo ?");
        muz=input.nextDouble();
        System.out.println("Domates kaç kilo ?" );
        domates=input.nextDouble();
        System.out.println("Patlican kaç kilo ?");
        patlican=input.nextDouble();
toplam=(elma*elmaF)+ (armut * armutF)+ (domates * domatesF) + (muz*muzF)+ (patlicamF* patlican);
        System.out.println("Toplam : " + toplam);
    }
}
