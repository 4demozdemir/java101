package desen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        x = scanner.nextInt();
        recursive(x,x,true);

    }

    static void recursive(int x,int y,boolean z){
        System.out.print(y+" ");
        if(z==false && x==y)
            return;
        if(z){
            if(y-5>0)
                recursive(x,y-5,true);
            else
                recursive(x,y-5,false);
        }
        else
            recursive(x,y+5,false);
    }
}
