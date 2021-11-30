package matrisTranspozu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][]dizi={{1,2,3},{4,5,6},{7,8,9}};
        int[][] transpose = new int[dizi.length][dizi.length];

        System.out.println("------------------Orjinal-------------------------");
        for(int i = 0; i < dizi.length; i++) {
            for(int j = 0; j < dizi[0].length; j++) {
                System.out.print(dizi[i][j] + "  ");
            }
            System.out.print("\n");
        }


System.out.println("------------------Transpose-------------------------");
        for(int i = 0;i<dizi.length;i++){
                for (int j = 0; j< dizi.length;j++){
                    transpose[i][j]=dizi[j][i];
                }
            }


        for(int i = 0; i < transpose.length; i++) {
            for(int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
