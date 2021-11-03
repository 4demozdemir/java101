package artikYilHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year,calculus;
        System.out.print("Yıl Giriniz: ");
        try (Scanner input = new Scanner(System.in)) {
            year = input.nextInt();
        }
        calculus=year % 400;
        if (calculus==0){
            System.out.print(year+" bir  artık Yıldır " );
        }else System.out.println(year+" bir  artık yıl değildir.");

    }
}
