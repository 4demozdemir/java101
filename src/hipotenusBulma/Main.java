package hipotenusBulma;

import java.util.Scanner;

public class Main {
    public  static void main(String[]args){
        double a,b,c ,hipotenus;
        Scanner input = new Scanner(System.in);
        System.out.println("a kenarını giriniz...");
        a=input.nextInt();
        System.out.println("b kenarını giriniz...");
        b=input.nextInt();
        c=Math.sqrt((a*a)+(b*b));
System.out.println("Hipotenus : "+c);
    }
}
