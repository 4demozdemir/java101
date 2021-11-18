package harmonikOrtalama;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] number = {1, 96, 56, 32, 63, 25, 12, 32, 47, 42};
        double sum = 0;
        double harAverage = 0;
        int nume;
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            nume= (int) number[i];
            sum += 1.0 / nume;
            System.out.println("sum : " + sum+" " + number[i]);
        }
        int say = number.length;
        System.out.println("Harmonik ortalama : " + sum );
        System.out.println("Harmonik ortalama : " + String.format("[%f]", say / sum) );
    }
}
