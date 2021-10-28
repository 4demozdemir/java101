package kullanıcıGiris;

import javax.swing.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pasNew ;
        int sec ;


        System.out.print("Kullanıcı adı : ");
        String userName = input.nextLine();
        System.out.print("Şifre : ");
        String password = input.nextLine();

        if (userName.equals("admin") && password.equals("12345")) {
            System.out.print("Giriş başarılı...");
        } else {
            System.out.println("kullanıcı adı veya şifre   yanlış ");
            System.out.println("şifre sıfırlamak ister misin \n 1-Evet  \n 2-Hayır");
        }

    }
}


