package daireAlanCevreHesaplama;
import java.util.Scanner;
import static java.lang.System.in;
public class Main {
    public  static void main(String[]args){
       Scanner input = new Scanner(in);
       System.out.println("Yarıçap uzunluğunu giriniz ? ");
       double radius=input.nextDouble(),alan,cevre;
            alan = Math.PI * radius *radius;
            cevre= Math.PI *radius * 2 ;
    System.out.println("Alan : " + alan );
    System.out.println("Cevre : "+ cevre);

    }
}
