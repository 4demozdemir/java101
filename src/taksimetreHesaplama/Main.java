package taksimetreHesaplama;

import java.util.Scanner;

public class Main {
    public  static void main(String[]args){
        double km=2.20,start= 10,wayTaken,calculation;
        Scanner input = new Scanner(System.in);
        System.out.println("How many kilometers traveled ? :");
        wayTaken=input.nextDouble();

    calculation =(km * wayTaken)+start;
    if (calculation<20){
        calculation=20;
    }
    System.out.println("Total : "+calculation);
    }
}


