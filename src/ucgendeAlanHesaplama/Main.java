package ucgendeAlanHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
    double a,b,c,u,alan,cevre;
        Scanner input =new Scanner(System.in);
        System.out.println("Kenar1 uzunluğu...");
        a=input.nextDouble();
        System.out.println("Kenar2 uzunluğu...");
        b=input.nextDouble();
        System.out.println("Kenar3 uzunluğu...");
        c=input.nextDouble();
       u = (a + b + c) / 2;
       cevre=2*u;
       alan = (int) Math.sqrt(u * (u - a) * (u - b) * (u - c));
System.out.println("Alan :"+alan);
System.out.println("Çevre : " + cevre
);
    }
}
