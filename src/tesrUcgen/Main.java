package tesrUcgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.print("İstenilen basamak sayısı : ");
        int n = input.nextInt();

        for (int k=1;k<=n;k++)
        {//boşluk yaratmak için
            for (int l =1 ; l <=k; l++)
            {
                System.out.print(" ");
            }
            //yıldız listelemek için
            for (int m = n; m >k ; m--)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
