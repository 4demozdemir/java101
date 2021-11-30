package sayiTahminOyunu;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
        System.out.println("************ HOŞGELDİNİZ **************");
        Scanner input = new Scanner(System.in);
        System.out.println("Tahmininizi giriniz : ");
        int tahmin = input.nextInt();
        if (tahmin == number) {
            System.out.println("Tebrikler doğru tahmin ettiniz :)");
        } else {
            System.out.println("Malesef yanlış tahmin ettiniz :(");
        }
        }
    }
