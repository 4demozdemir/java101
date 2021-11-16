package atmHesapYonetimi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password  ;
        int right = 3, select = 0;
        double balance = 1500;

        while (right > 0) {
            System.out.println("Kullanıcı adı : ");
            userName = input.nextLine();
            System.out.println("Şifre : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("123456")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");

                select=input.nextInt();
                switch (select){
                    case 1 :
                        System.out.print("Para miktarı : ");
                        double price1 =input.nextDouble();
                        balance+=price1;
                        break;
                    case 2:
                        System.out.print("Para miktarı : ");
                        double price = input.nextDouble();
                        if (balance<price){
                            System.out.println("Bakiye yetersiz.");

                        }else{
                            balance-=price;
                        }
                    case 3:
                        System.out.println("Bakiyeniz : "+balance);
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                }
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }


        }

    }
}
