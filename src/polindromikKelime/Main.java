package polindromikKelime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tersi = "";
        boolean kon = false;
        System.out.println("Bir kelime gir : ");
        String str = input.nextLine();

        for (int i = str.length() - 1; i >=0; i--) {
            tersi += str.charAt(i);
        }
        if (str.equals(tersi)) {
            System.out.println("polindromik kelimedir");
        }else{
            System.out.println("polindromik değildir");
        }

    }


}
